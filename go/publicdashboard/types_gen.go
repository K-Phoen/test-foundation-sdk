// Code generated - EDITING IS FUTILE. DO NOT EDIT.

package publicdashboard

type PublicDashboard struct {
	// Unique public dashboard identifier
	Uid string `json:"uid"`
	// Dashboard unique identifier referenced by this public dashboard
	DashboardUid string `json:"dashboardUid"`
	// Unique public access token
	AccessToken *string `json:"accessToken,omitempty"`
	// Flag that indicates if the public dashboard is enabled
	IsEnabled bool `json:"isEnabled"`
	// Flag that indicates if annotations are enabled
	AnnotationsEnabled bool `json:"annotationsEnabled"`
	// Flag that indicates if the time range picker is enabled
	TimeSelectionEnabled bool `json:"timeSelectionEnabled"`
}

func (resource PublicDashboard) Equals(other PublicDashboard) bool {
	if resource.Uid != other.Uid {
		return false
	}
	if resource.DashboardUid != other.DashboardUid {
		return false
	}
	if resource.AccessToken == nil && other.AccessToken != nil || resource.AccessToken != nil && other.AccessToken == nil {
		return false
	}

	if resource.AccessToken != nil {
		if *resource.AccessToken != *other.AccessToken {
			return false
		}
	}
	if resource.IsEnabled != other.IsEnabled {
		return false
	}
	if resource.AnnotationsEnabled != other.AnnotationsEnabled {
		return false
	}
	if resource.TimeSelectionEnabled != other.TimeSelectionEnabled {
		return false
	}

	return true
}