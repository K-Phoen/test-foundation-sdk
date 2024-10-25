#!/usr/bin/env bash

# Exit on error. Append "|| true" if you expect an error.
set -o errexit
# Exit on error inside any functions or subshells.
set -o errtrace
# Do not allow use of undefined vars. Use ${VAR:-} to use an undefined VAR
set -o nounset
# Catch the error in case mysqldump fails (but gzip succeeds) in `mysqldump |gzip`
set -o pipefail

__dir="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
source "${__dir}/versions.sh"

FOUNDATION_SDK_REPO=${FOUNDATION_SDK_REPO:-'https://github.com/K-Phoen/test-foundation-sdk.git'}
COG_VERSION="v0.0.x" # hardcoded for now

# Cleanup potential leftovers from previous runs.
rm -rf "${__dir}/tmp-foundation-sdk"
rm -rf "${__dir}/versions"

mkdir "${__dir}/versions"
git clone "${FOUNDATION_SDK_REPO}" "${__dir}/tmp-foundation-sdk"

for version in ${ALL_GRAFANA_VERSIONS//;/ } ; do
    full_version="${version}+cog-${COG_VERSION}"

    echo "🪧 Pulling documentation for Foundation SDK version ${full_version}"

    git -C "${__dir}/tmp-foundation-sdk" fetch origin "${full_version}"
    git -C "${__dir}/tmp-foundation-sdk" checkout "${full_version}"
    git -C "${__dir}/tmp-foundation-sdk" pull --ff-only origin "${full_version}"

    find "${__dir}/tmp-foundation-sdk" -maxdepth 1 -mindepth 1 -type d -print | while read -r target; do
        language_name=${target#"${__dir}/tmp-foundation-sdk"}

        if [ -d "${target}/docs" ]; then
            mkdir -p "${__dir}/versions/${full_version}/${language_name}"
            cp -R ${target}/docs/* "${__dir}/versions/${full_version}/${language_name}"
        fi
    done
done
