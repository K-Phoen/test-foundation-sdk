---
title: <span class="badge object-type-struct"></span> TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions
---
# <span class="badge object-type-struct"></span> TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions

## Definition

```go
type TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions struct {
    TableAutoCellOptions *common.TableAutoCellOptions `json:"TableAutoCellOptions,omitempty"`
    TableSparklineCellOptions *common.TableSparklineCellOptions `json:"TableSparklineCellOptions,omitempty"`
    TableBarGaugeCellOptions *common.TableBarGaugeCellOptions `json:"TableBarGaugeCellOptions,omitempty"`
    TableColoredBackgroundCellOptions *common.TableColoredBackgroundCellOptions `json:"TableColoredBackgroundCellOptions,omitempty"`
    TableColorTextCellOptions *common.TableColorTextCellOptions `json:"TableColorTextCellOptions,omitempty"`
    TableImageCellOptions *common.TableImageCellOptions `json:"TableImageCellOptions,omitempty"`
    TableDataLinksCellOptions *common.TableDataLinksCellOptions `json:"TableDataLinksCellOptions,omitempty"`
    TableActionsCellOptions *common.TableActionsCellOptions `json:"TableActionsCellOptions,omitempty"`
    TableJsonViewCellOptions *common.TableJsonViewCellOptions `json:"TableJsonViewCellOptions,omitempty"`
}
```
## Methods

### <span class="badge object-method"></span> MarshalJSON

MarshalJSON implements a custom JSON marshalling logic to encode `TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions` as JSON.

```go
func (tableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions *TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions) MarshalJSON() ([]byte, error)
```

### <span class="badge object-method"></span> UnmarshalJSON

UnmarshalJSON implements a custom JSON unmarshalling logic to decode `TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions` from JSON.

```go
func (tableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions *TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions) UnmarshalJSON(raw []byte) error
```

### <span class="badge object-method"></span> UnmarshalJSONStrict

UnmarshalJSONStrict implements a custom JSON unmarshalling logic to decode `TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions` from JSON.

Note: the unmarshalling done by this function is strict. It will fail over required fields being absent from the input, fields having an incorrect type, unexpected fields being present, …

```go
func (tableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions *TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions) UnmarshalJSONStrict(raw []byte) error
```

### <span class="badge object-method"></span> Equals

Equals tests the equality of two `TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions` objects.

```go
func (tableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions *TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions) Equals(other TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions) bool
```

### <span class="badge object-method"></span> Validate

Validate checks all the validation constraints that may be defined on `TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions` fields for violations and returns them.

```go
func (tableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions *TableAutoCellOptionsOrTableSparklineCellOptionsOrTableBarGaugeCellOptionsOrTableColoredBackgroundCellOptionsOrTableColorTextCellOptionsOrTableImageCellOptionsOrTableDataLinksCellOptionsOrTableActionsCellOptionsOrTableJsonViewCellOptions) Validate() error
```
