# ProjectMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_public** | **String** | The public status of the project. The valid values are \&quot;true\&quot;, \&quot;false\&quot;. |  [optional]
**enableContentTrust** | **String** | Whether content trust is enabled or not. If it is enabled, user cann&#x27;t pull unsigned images from this project. The valid values are \&quot;true\&quot;, \&quot;false\&quot;. |  [optional]
**preventVul** | **String** | Whether prevent the vulnerable images from running. The valid values are \&quot;true\&quot;, \&quot;false\&quot;. |  [optional]
**severity** | **String** | If the vulnerability is high than severity defined here, the images cann&#x27;t be pulled. The valid values are \&quot;negligible\&quot;, \&quot;low\&quot;, \&quot;medium\&quot;, \&quot;high\&quot;, \&quot;critical\&quot;. |  [optional]
**autoScan** | **String** | Whether scan images automatically when pushing. The valid values are \&quot;true\&quot;, \&quot;false\&quot;. |  [optional]
