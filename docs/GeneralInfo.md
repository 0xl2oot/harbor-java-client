# GeneralInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**withNotary** | **Boolean** | If the Harbor instance is deployed with nested notary. |  [optional]
**withClair** | **Boolean** | If the Harbor instance is deployed with nested clair. |  [optional]
**withAdmiral** | **Boolean** | If the Harbor instance is deployed with Admiral. |  [optional]
**admiralEndpoint** | **String** | The url of the endpoint of admiral instance. |  [optional]
**authMode** | **String** | The auth mode of current Harbor instance. |  [optional]
**projectCreationRestriction** | **String** | Indicate who can create projects, it could be &#x27;adminonly&#x27; or &#x27;everyone&#x27;. |  [optional]
**selfRegistration** | **Boolean** | Indicate whether the Harbor instance enable user to register himself. |  [optional]
**hasCaRoot** | **Boolean** | Indicate whether there is a ca root cert file ready for download in the file system. |  [optional]
**harborVersion** | **String** | The build version of Harbor. |  [optional]
**nextScanAll** | **Integer** | The UTC time in milliseconds, after which user can call scanAll API to scan all images. |  [optional]
**clairVulnerabilityStatus** | **Object** | The status of vulnerability data of Clair. |  [optional]
