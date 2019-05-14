# DetailedTag

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**digest** | **String** | The digest of the tag. |  [optional]
**name** | **String** | The name of the tag. |  [optional]
**size** | **Integer** | The size of the image. |  [optional]
**architecture** | **String** | The architecture of the image. |  [optional]
**os** | **String** | The os of the image. |  [optional]
**dockerVersion** | **String** | The version of docker which builds the image. |  [optional]
**author** | **String** | The author of the image. |  [optional]
**created** | **String** | The build time of the image. |  [optional]
**signature** | **Object** | The signature of image, defined by RepoSignature. If it is null, the image is unsigned. |  [optional]
**scanOverview** | **Object** | The overview of the scan result.  This is an optional property. |  [optional]
**labels** | [**List&lt;Label&gt;**](Label.md) | The label list. |  [optional]
