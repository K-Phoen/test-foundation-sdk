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

${__dir}/pull-versions.sh

echo "🪧 Building main website"
rm -rf ${__dir}/site
mkdocs build -f ${__dir}/mkdocs.yml -d ${__dir}/site

# TODO: build docs/versions.json file somewhere, somehow.

find "${__dir}/versions" -maxdepth 1 -mindepth 1 -type d -print | while read -r target; do
    full_version=${target#"${__dir}/versions/"}
    echo "🪧 Building documentation for version ${full_version}"

    SOURCE_VERSION_FOLDER="./versions/${full_version}" mkdocs build -f ${__dir}/mkdocs-version.yml -d ${__dir}/site/${full_version}
done

# TODO: minify output
