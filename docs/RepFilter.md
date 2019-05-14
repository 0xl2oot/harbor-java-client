# RepFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | The replication policy filter kind. The valid values are project, repository and tag. |  [optional]
**value** | **String** | The value of replication policy filter. When creating repository and tag filter, filling it with the pattern as string. When creating label filter, filling it with label ID as integer. |  [optional]
**pattern** | **String** | Depraceted, use value instead. The replication policy filter pattern. |  [optional]
**metadata** | **Object** | This map object is the replication policy filter metadata. |  [optional]
