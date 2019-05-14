# ProductsApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chartrepoChartsPost**](ProductsApi.md#chartrepoChartsPost) | **POST** /chartrepo/charts | Upload a chart file to the defult &#x27;library&#x27; project.
[**chartrepoHealthGet**](ProductsApi.md#chartrepoHealthGet) | **GET** /chartrepo/health | Check the health of chart repository service.
[**chartrepoRepoChartsGet**](ProductsApi.md#chartrepoRepoChartsGet) | **GET** /chartrepo/{repo}/charts | Get all the charts under the specified project
[**chartrepoRepoChartsNameDelete**](ProductsApi.md#chartrepoRepoChartsNameDelete) | **DELETE** /chartrepo/{repo}/charts/{name} | Delete all the versions of the specified chart
[**chartrepoRepoChartsNameGet**](ProductsApi.md#chartrepoRepoChartsNameGet) | **GET** /chartrepo/{repo}/charts/{name} | Get all the versions of the specified chart
[**chartrepoRepoChartsNameVersionDelete**](ProductsApi.md#chartrepoRepoChartsNameVersionDelete) | **DELETE** /chartrepo/{repo}/charts/{name}/{version} | Delete the specified chart version
[**chartrepoRepoChartsNameVersionGet**](ProductsApi.md#chartrepoRepoChartsNameVersionGet) | **GET** /chartrepo/{repo}/charts/{name}/{version} | Get the specified chart version
[**chartrepoRepoChartsPost**](ProductsApi.md#chartrepoRepoChartsPost) | **POST** /chartrepo/{repo}/charts | Upload a chart file to the specified project.
[**chartrepoRepoProvPost**](ProductsApi.md#chartrepoRepoProvPost) | **POST** /chartrepo/{repo}/prov | Upload a provance file to the specified project.
[**chartreporepoChartsnameversionLabelsGet**](ProductsApi.md#chartreporepoChartsnameversionLabelsGet) | **GET** /chartrepo/:repo/charts/:name/:version/labels | Return the attahced labels of chart.
[**chartreporepoChartsnameversionLabelsPost**](ProductsApi.md#chartreporepoChartsnameversionLabelsPost) | **POST** /chartrepo/:repo/charts/:name/:version/labels | Mark label to chart.
[**chartreporepoChartsnameversionLabelsidDelete**](ProductsApi.md#chartreporepoChartsnameversionLabelsidDelete) | **DELETE** /chartrepo/:repo/charts/:name/:version/labels/:id | Remove label from chart.
[**configurationsGet**](ProductsApi.md#configurationsGet) | **GET** /configurations | Get system configurations.
[**configurationsPut**](ProductsApi.md#configurationsPut) | **PUT** /configurations | Modify system configurations.
[**configurationsResetPost**](ProductsApi.md#configurationsResetPost) | **POST** /configurations/reset | Reset system configurations.
[**emailPingPost**](ProductsApi.md#emailPingPost) | **POST** /email/ping | Test connection and authentication with email server.
[**internalSyncregistryPost**](ProductsApi.md#internalSyncregistryPost) | **POST** /internal/syncregistry | Sync repositories from registry to DB.
[**jobsReplicationGet**](ProductsApi.md#jobsReplicationGet) | **GET** /jobs/replication | List filters jobs according to the policy and repository
[**jobsReplicationIdDelete**](ProductsApi.md#jobsReplicationIdDelete) | **DELETE** /jobs/replication/{id} | Delete specific ID job.
[**jobsReplicationIdLogGet**](ProductsApi.md#jobsReplicationIdLogGet) | **GET** /jobs/replication/{id}/log | Get job logs.
[**jobsReplicationPut**](ProductsApi.md#jobsReplicationPut) | **PUT** /jobs/replication | Update status of jobs. Only stop is supported for now.
[**jobsScanIdLogGet**](ProductsApi.md#jobsScanIdLogGet) | **GET** /jobs/scan/{id}/log | Get job logs.
[**labelsGet**](ProductsApi.md#labelsGet) | **GET** /labels | List labels according to the query strings.
[**labelsIdDelete**](ProductsApi.md#labelsIdDelete) | **DELETE** /labels/{id} | Delete the label specified by ID.
[**labelsIdGet**](ProductsApi.md#labelsIdGet) | **GET** /labels/{id} | Get the label specified by ID.
[**labelsIdPut**](ProductsApi.md#labelsIdPut) | **PUT** /labels/{id} | Update the label properties.
[**labelsIdResourcesGet**](ProductsApi.md#labelsIdResourcesGet) | **GET** /labels/{id}/resources | Get the resources that the label is referenced by.
[**labelsPost**](ProductsApi.md#labelsPost) | **POST** /labels | Post creates a label
[**ldapGroupsSearchGet**](ProductsApi.md#ldapGroupsSearchGet) | **GET** /ldap/groups/search | Search available ldap groups.
[**ldapPingPost**](ProductsApi.md#ldapPingPost) | **POST** /ldap/ping | Ping available ldap service.
[**ldapUsersImportPost**](ProductsApi.md#ldapUsersImportPost) | **POST** /ldap/users/import | Import selected available ldap users.
[**ldapUsersSearchGet**](ProductsApi.md#ldapUsersSearchGet) | **GET** /ldap/users/search | Search available ldap users.
[**logsGet**](ProductsApi.md#logsGet) | **GET** /logs | Get recent logs of the projects which the user is a member of
[**policiesReplicationGet**](ProductsApi.md#policiesReplicationGet) | **GET** /policies/replication | List filters policies by name and project_id
[**policiesReplicationIdDelete**](ProductsApi.md#policiesReplicationIdDelete) | **DELETE** /policies/replication/{id} | Delete the replication policy specified by ID.
[**policiesReplicationIdGet**](ProductsApi.md#policiesReplicationIdGet) | **GET** /policies/replication/{id} | Get replication policy.
[**policiesReplicationIdPut**](ProductsApi.md#policiesReplicationIdPut) | **PUT** /policies/replication/{id} | Put modifies name, description, target and enablement of policy.
[**policiesReplicationPost**](ProductsApi.md#policiesReplicationPost) | **POST** /policies/replication | Post creates a policy
[**projectsGet**](ProductsApi.md#projectsGet) | **GET** /projects | List projects
[**projectsHead**](ProductsApi.md#projectsHead) | **HEAD** /projects | Check if the project name user provided already exists.
[**projectsPost**](ProductsApi.md#projectsPost) | **POST** /projects | Create a new project.
[**projectsProjectIdDelete**](ProductsApi.md#projectsProjectIdDelete) | **DELETE** /projects/{project_id} | Delete project by projectID
[**projectsProjectIdGet**](ProductsApi.md#projectsProjectIdGet) | **GET** /projects/{project_id} | Return specific project detail infomation
[**projectsProjectIdLogsGet**](ProductsApi.md#projectsProjectIdLogsGet) | **GET** /projects/{project_id}/logs | Get access logs accompany with a relevant project.
[**projectsProjectIdMembersGet**](ProductsApi.md#projectsProjectIdMembersGet) | **GET** /projects/{project_id}/members | Get all project member information
[**projectsProjectIdMembersMidDelete**](ProductsApi.md#projectsProjectIdMembersMidDelete) | **DELETE** /projects/{project_id}/members/{mid} | Delete project member
[**projectsProjectIdMembersMidGet**](ProductsApi.md#projectsProjectIdMembersMidGet) | **GET** /projects/{project_id}/members/{mid} | Get the project member information
[**projectsProjectIdMembersMidPut**](ProductsApi.md#projectsProjectIdMembersMidPut) | **PUT** /projects/{project_id}/members/{mid} | Update project member
[**projectsProjectIdMembersPost**](ProductsApi.md#projectsProjectIdMembersPost) | **POST** /projects/{project_id}/members | Create project member
[**projectsProjectIdMetadatasGet**](ProductsApi.md#projectsProjectIdMetadatasGet) | **GET** /projects/{project_id}/metadatas | Get project metadata.
[**projectsProjectIdMetadatasMetaNameDelete**](ProductsApi.md#projectsProjectIdMetadatasMetaNameDelete) | **DELETE** /projects/{project_id}/metadatas/{meta_name} | Delete metadata of a project
[**projectsProjectIdMetadatasMetaNameGet**](ProductsApi.md#projectsProjectIdMetadatasMetaNameGet) | **GET** /projects/{project_id}/metadatas/{meta_name} | Get project metadata
[**projectsProjectIdMetadatasMetaNamePut**](ProductsApi.md#projectsProjectIdMetadatasMetaNamePut) | **PUT** /projects/{project_id}/metadatas/{meta_name} | Update metadata of a project.
[**projectsProjectIdMetadatasPost**](ProductsApi.md#projectsProjectIdMetadatasPost) | **POST** /projects/{project_id}/metadatas | Add metadata for the project.
[**projectsProjectIdPut**](ProductsApi.md#projectsProjectIdPut) | **PUT** /projects/{project_id} | Update properties for a selected project.
[**replicationsPost**](ProductsApi.md#replicationsPost) | **POST** /replications | Trigger the replication according to the specified policy.
[**repositoriesGet**](ProductsApi.md#repositoriesGet) | **GET** /repositories | Get repositories accompany with relevant project and repo name.
[**repositoriesRepoNameDelete**](ProductsApi.md#repositoriesRepoNameDelete) | **DELETE** /repositories/{repo_name} | Delete a repository.
[**repositoriesRepoNameLabelsGet**](ProductsApi.md#repositoriesRepoNameLabelsGet) | **GET** /repositories/{repo_name}/labels | Get labels of a repository.
[**repositoriesRepoNameLabelsLabelIdDelete**](ProductsApi.md#repositoriesRepoNameLabelsLabelIdDelete) | **DELETE** /repositories/{repo_name}/labels/{label_id} | Delete label from the repository.
[**repositoriesRepoNameLabelsPost**](ProductsApi.md#repositoriesRepoNameLabelsPost) | **POST** /repositories/{repo_name}/labels | Add a label to the repository.
[**repositoriesRepoNamePut**](ProductsApi.md#repositoriesRepoNamePut) | **PUT** /repositories/{repo_name} | Update description of the repository.
[**repositoriesRepoNameSignaturesGet**](ProductsApi.md#repositoriesRepoNameSignaturesGet) | **GET** /repositories/{repo_name}/signatures | Get signature information of a repository
[**repositoriesRepoNameTagsGet**](ProductsApi.md#repositoriesRepoNameTagsGet) | **GET** /repositories/{repo_name}/tags | Get tags of a relevant repository.
[**repositoriesRepoNameTagsPost**](ProductsApi.md#repositoriesRepoNameTagsPost) | **POST** /repositories/{repo_name}/tags | Retag an image
[**repositoriesRepoNameTagsTagDelete**](ProductsApi.md#repositoriesRepoNameTagsTagDelete) | **DELETE** /repositories/{repo_name}/tags/{tag} | Delete a tag in a repository.
[**repositoriesRepoNameTagsTagGet**](ProductsApi.md#repositoriesRepoNameTagsTagGet) | **GET** /repositories/{repo_name}/tags/{tag} | Get the tag of the repository.
[**repositoriesRepoNameTagsTagLabelsGet**](ProductsApi.md#repositoriesRepoNameTagsTagLabelsGet) | **GET** /repositories/{repo_name}/tags/{tag}/labels | Get labels of an image.
[**repositoriesRepoNameTagsTagLabelsLabelIdDelete**](ProductsApi.md#repositoriesRepoNameTagsTagLabelsLabelIdDelete) | **DELETE** /repositories/{repo_name}/tags/{tag}/labels/{label_id} | Delete label from the image.
[**repositoriesRepoNameTagsTagLabelsPost**](ProductsApi.md#repositoriesRepoNameTagsTagLabelsPost) | **POST** /repositories/{repo_name}/tags/{tag}/labels | Add a label to image.
[**repositoriesRepoNameTagsTagManifestGet**](ProductsApi.md#repositoriesRepoNameTagsTagManifestGet) | **GET** /repositories/{repo_name}/tags/{tag}/manifest | Get manifests of a relevant repository.
[**repositoriesRepoNameTagsTagScanPost**](ProductsApi.md#repositoriesRepoNameTagsTagScanPost) | **POST** /repositories/{repo_name}/tags/{tag}/scan | Scan the image.
[**repositoriesRepoNameTagsTagVulnerabilityDetailsGet**](ProductsApi.md#repositoriesRepoNameTagsTagVulnerabilityDetailsGet) | **GET** /repositories/{repo_name}/tags/{tag}/vulnerability/details | Get vulnerability details of the image.
[**repositoriesScanAllPost**](ProductsApi.md#repositoriesScanAllPost) | **POST** /repositories/scanAll | Scan all images of the registry.
[**repositoriesTopGet**](ProductsApi.md#repositoriesTopGet) | **GET** /repositories/top | Get public repositories which are accessed most.
[**searchGet**](ProductsApi.md#searchGet) | **GET** /search | Search for projects, repositories and helm charts
[**statisticsGet**](ProductsApi.md#statisticsGet) | **GET** /statistics | Get projects number and repositories number relevant to the user
[**systemGcGet**](ProductsApi.md#systemGcGet) | **GET** /system/gc | Get gc results.
[**systemGcIdGet**](ProductsApi.md#systemGcIdGet) | **GET** /system/gc/{id} | Get gc status.
[**systemGcIdLogGet**](ProductsApi.md#systemGcIdLogGet) | **GET** /system/gc/{id}/log | Get gc job log.
[**systemGcScheduleGet**](ProductsApi.md#systemGcScheduleGet) | **GET** /system/gc/schedule | Get gc&#x27;s schedule.
[**systemGcSchedulePost**](ProductsApi.md#systemGcSchedulePost) | **POST** /system/gc/schedule | Create a gc schedule.
[**systemGcSchedulePut**](ProductsApi.md#systemGcSchedulePut) | **PUT** /system/gc/schedule | Update gc&#x27;s schedule.
[**systeminfoGet**](ProductsApi.md#systeminfoGet) | **GET** /systeminfo | Get general system info
[**systeminfoGetcertGet**](ProductsApi.md#systeminfoGetcertGet) | **GET** /systeminfo/getcert | Get default root certificate.
[**systeminfoVolumesGet**](ProductsApi.md#systeminfoVolumesGet) | **GET** /systeminfo/volumes | Get system volume info (total/free size).
[**targetsGet**](ProductsApi.md#targetsGet) | **GET** /targets | List filters targets by name.
[**targetsIdDelete**](ProductsApi.md#targetsIdDelete) | **DELETE** /targets/{id} | Delete specific replication&#x27;s target.
[**targetsIdGet**](ProductsApi.md#targetsIdGet) | **GET** /targets/{id} | Get replication&#x27;s target.
[**targetsIdPoliciesGet**](ProductsApi.md#targetsIdPoliciesGet) | **GET** /targets/{id}/policies/ | List the target relevant policies.
[**targetsIdPut**](ProductsApi.md#targetsIdPut) | **PUT** /targets/{id} | Update replication&#x27;s target.
[**targetsPingPost**](ProductsApi.md#targetsPingPost) | **POST** /targets/ping | Ping validates target.
[**targetsPost**](ProductsApi.md#targetsPost) | **POST** /targets | Create a new replication target.
[**usergroupsGet**](ProductsApi.md#usergroupsGet) | **GET** /usergroups | Get all user groups information
[**usergroupsGroupIdDelete**](ProductsApi.md#usergroupsGroupIdDelete) | **DELETE** /usergroups/{group_id} | Delete user group
[**usergroupsGroupIdGet**](ProductsApi.md#usergroupsGroupIdGet) | **GET** /usergroups/{group_id} | Get user group information
[**usergroupsGroupIdPut**](ProductsApi.md#usergroupsGroupIdPut) | **PUT** /usergroups/{group_id} | Update group information
[**usergroupsPost**](ProductsApi.md#usergroupsPost) | **POST** /usergroups | Create user group
[**usersCurrentGet**](ProductsApi.md#usersCurrentGet) | **GET** /users/current | Get current user info.
[**usersGet**](ProductsApi.md#usersGet) | **GET** /users | Get registered users of Harbor.
[**usersPost**](ProductsApi.md#usersPost) | **POST** /users | Creates a new user account.
[**usersUserIdDelete**](ProductsApi.md#usersUserIdDelete) | **DELETE** /users/{user_id} | Mark a registered user as be removed.
[**usersUserIdGet**](ProductsApi.md#usersUserIdGet) | **GET** /users/{user_id} | Get a user&#x27;s profile.
[**usersUserIdPasswordPut**](ProductsApi.md#usersUserIdPasswordPut) | **PUT** /users/{user_id}/password | Change the password on a user that already exists.
[**usersUserIdPut**](ProductsApi.md#usersUserIdPut) | **PUT** /users/{user_id} | Update a registered user to change his profile.
[**usersUserIdSysadminPut**](ProductsApi.md#usersUserIdSysadminPut) | **PUT** /users/{user_id}/sysadmin | Update a registered user to change to be an administrator of Harbor.

<a name="chartrepoChartsPost"></a>
# **chartrepoChartsPost**
> chartrepoChartsPost(chart, prov)

Upload a chart file to the defult &#x27;library&#x27; project.

Upload a chart file to the default &#x27;library&#x27; project. Uploading together with the prov file at the same time is also supported.

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
File chart = new File("chart_example"); // File | 
File prov = new File("prov_example"); // File | 
try {
    apiInstance.chartrepoChartsPost(chart, prov);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoChartsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chart** | **File**|  | [optional]
 **prov** | **File**|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="chartrepoHealthGet"></a>
# **chartrepoHealthGet**
> Object chartrepoHealthGet()

Check the health of chart repository service.

Check the health of chart repository service.

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    Object result = apiInstance.chartrepoHealthGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoHealthGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="chartrepoRepoChartsGet"></a>
# **chartrepoRepoChartsGet**
> List&lt;ChartInfoEntry&gt; chartrepoRepoChartsGet(repo)

Get all the charts under the specified project

Get all the charts under the specified project

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
try {
    List<ChartInfoEntry> result = apiInstance.chartrepoRepoChartsGet(repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | [**String**](.md)| The project name |

### Return type

[**List&lt;ChartInfoEntry&gt;**](ChartInfoEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="chartrepoRepoChartsNameDelete"></a>
# **chartrepoRepoChartsNameDelete**
> chartrepoRepoChartsNameDelete(repo, name)

Delete all the versions of the specified chart

Delete all the versions of the specified chart

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
try {
    apiInstance.chartrepoRepoChartsNameDelete(repo, name);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | [**String**](.md)| The project name |
 **name** | [**String**](.md)| The chart name |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="chartrepoRepoChartsNameGet"></a>
# **chartrepoRepoChartsNameGet**
> chartrepoRepoChartsNameGet(repo, name)

Get all the versions of the specified chart

Get all the versions of the specified chart

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
try {
    apiInstance.chartrepoRepoChartsNameGet(repo, name);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | [**String**](.md)| The project name |
 **name** | [**String**](.md)| The chart name |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="chartrepoRepoChartsNameVersionDelete"></a>
# **chartrepoRepoChartsNameVersionDelete**
> chartrepoRepoChartsNameVersionDelete(repo, name, version)

Delete the specified chart version

Delete the specified chart version

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartrepoRepoChartsNameVersionDelete(repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsNameVersionDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | [**String**](.md)| The project name |
 **name** | [**String**](.md)| The chart name |
 **version** | [**String**](.md)| The chart version |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="chartrepoRepoChartsNameVersionGet"></a>
# **chartrepoRepoChartsNameVersionGet**
> chartrepoRepoChartsNameVersionGet(repo, name, version)

Get the specified chart version

Get the specified chart version

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartrepoRepoChartsNameVersionGet(repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsNameVersionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | [**String**](.md)| The project name |
 **name** | [**String**](.md)| The chart name |
 **version** | [**String**](.md)| The chart version |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="chartrepoRepoChartsPost"></a>
# **chartrepoRepoChartsPost**
> chartrepoRepoChartsPost(repo, chart, prov)

Upload a chart file to the specified project.

Upload a chart file to the specified project. With this API, the corresponding provance file can be uploaded together with chart file at once.

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
File chart = new File("chart_example"); // File | 
File prov = new File("prov_example"); // File | 
try {
    apiInstance.chartrepoRepoChartsPost(repo, chart, prov);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | [**String**](.md)| The project name |
 **chart** | **File**|  | [optional]
 **prov** | **File**|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="chartrepoRepoProvPost"></a>
# **chartrepoRepoProvPost**
> chartrepoRepoProvPost(repo, prov)

Upload a provance file to the specified project.

Upload a provance file to the specified project. The provance file should be targeted for an existing chart file.

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
File prov = new File("prov_example"); // File | 
try {
    apiInstance.chartrepoRepoProvPost(repo, prov);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoProvPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | [**String**](.md)| The project name |
 **prov** | **File**|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="chartreporepoChartsnameversionLabelsGet"></a>
# **chartreporepoChartsnameversionLabelsGet**
> chartreporepoChartsnameversionLabelsGet(repo, name, version)

Return the attahced labels of chart.

Return the attahced labels of the specified chart version.

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartreporepoChartsnameversionLabelsGet(repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartreporepoChartsnameversionLabelsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | [**String**](.md)| The project name |
 **name** | [**String**](.md)| The chart name |
 **version** | [**String**](.md)| The chart version |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="chartreporepoChartsnameversionLabelsPost"></a>
# **chartreporepoChartsnameversionLabelsPost**
> chartreporepoChartsnameversionLabelsPost(body, repo, name, version)

Mark label to chart.

Mark label to the specified chart version.

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Label body = new Label(); // Label | The label being marked to the chart version
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartreporepoChartsnameversionLabelsPost(body, repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartreporepoChartsnameversionLabelsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Label**](Label.md)| The label being marked to the chart version |
 **repo** | [**String**](.md)| The project name |
 **name** | [**String**](.md)| The chart name |
 **version** | [**String**](.md)| The chart version |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="chartreporepoChartsnameversionLabelsidDelete"></a>
# **chartreporepoChartsnameversionLabelsidDelete**
> chartreporepoChartsnameversionLabelsidDelete(repo, name, version, id)

Remove label from chart.

Remove label from the specified chart version.

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
Integer id = 56; // Integer | The label ID
try {
    apiInstance.chartreporepoChartsnameversionLabelsidDelete(repo, name, version, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartreporepoChartsnameversionLabelsidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | [**String**](.md)| The project name |
 **name** | [**String**](.md)| The chart name |
 **version** | [**String**](.md)| The chart version |
 **id** | [**Integer**](.md)| The label ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="configurationsGet"></a>
# **configurationsGet**
> ConfigurationsResponse configurationsGet()

Get system configurations.

This endpoint is for retrieving system configurations that only provides for admin user. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    ConfigurationsResponse result = apiInstance.configurationsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#configurationsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConfigurationsResponse**](ConfigurationsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="configurationsPut"></a>
# **configurationsPut**
> configurationsPut(body)

Modify system configurations.

This endpoint is for modifying system configurations that only provides for admin user. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Configurations body = new Configurations(); // Configurations | The configuration map can contain a subset of the attributes of the schema, which are to be updated.
try {
    apiInstance.configurationsPut(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#configurationsPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Configurations**](Configurations.md)| The configuration map can contain a subset of the attributes of the schema, which are to be updated. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="configurationsResetPost"></a>
# **configurationsResetPost**
> configurationsResetPost()

Reset system configurations.

Reset system configurations from environment variables. Can only be accessed by admin user. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    apiInstance.configurationsResetPost();
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#configurationsResetPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="emailPingPost"></a>
# **emailPingPost**
> emailPingPost(body)

Test connection and authentication with email server.

Test connection and authentication with email server.  

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
EmailServerSetting body = new EmailServerSetting(); // EmailServerSetting | Email server settings, if some of the settings are not assigned, they will be read from system configuration.
try {
    apiInstance.emailPingPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#emailPingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailServerSetting**](EmailServerSetting.md)| Email server settings, if some of the settings are not assigned, they will be read from system configuration. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="internalSyncregistryPost"></a>
# **internalSyncregistryPost**
> internalSyncregistryPost()

Sync repositories from registry to DB.

This endpoint is for syncing all repositories of registry with database.  

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    apiInstance.internalSyncregistryPost();
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#internalSyncregistryPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="jobsReplicationGet"></a>
# **jobsReplicationGet**
> List&lt;JobStatus&gt; jobsReplicationGet(policyId, opUuid, num, endTime, startTime, repository, status, page, pageSize)

List filters jobs according to the policy and repository

This endpoint let user list filters jobs according to the policy and repository. (if start_time and end_time are both null, list jobs of last 10 days) 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer policyId = 56; // Integer | The ID of the policy that triggered this job.
String opUuid = "opUuid_example"; // String | The UUID of one trigger of replication policy.
Integer num = 56; // Integer | The return list length number.
Integer endTime = 56; // Integer | The end time of jobs done. (Timestamp)
Integer startTime = 56; // Integer | The start time of jobs. (Timestamp)
String repository = "repository_example"; // String | The respond jobs list filter by repository name.
String status = "status_example"; // String | The respond jobs list filter by status.
Integer page = 56; // Integer | The page nubmer, default is 1.
Integer pageSize = 56; // Integer | The size of per page, default is 10, maximum is 100.
try {
    List<JobStatus> result = apiInstance.jobsReplicationGet(policyId, opUuid, num, endTime, startTime, repository, status, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#jobsReplicationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | [**Integer**](.md)| The ID of the policy that triggered this job. |
 **opUuid** | [**String**](.md)| The UUID of one trigger of replication policy. | [optional]
 **num** | [**Integer**](.md)| The return list length number. | [optional]
 **endTime** | [**Integer**](.md)| The end time of jobs done. (Timestamp) | [optional]
 **startTime** | [**Integer**](.md)| The start time of jobs. (Timestamp) | [optional]
 **repository** | [**String**](.md)| The respond jobs list filter by repository name. | [optional]
 **status** | [**String**](.md)| The respond jobs list filter by status. | [optional]
 **page** | [**Integer**](.md)| The page nubmer, default is 1. | [optional]
 **pageSize** | [**Integer**](.md)| The size of per page, default is 10, maximum is 100. | [optional]

### Return type

[**List&lt;JobStatus&gt;**](JobStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="jobsReplicationIdDelete"></a>
# **jobsReplicationIdDelete**
> jobsReplicationIdDelete(id)

Delete specific ID job.

This endpoint is aimed to remove specific ID job from jobservice. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | Delete job ID.
try {
    apiInstance.jobsReplicationIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#jobsReplicationIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| Delete job ID. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="jobsReplicationIdLogGet"></a>
# **jobsReplicationIdLogGet**
> jobsReplicationIdLogGet(id)

Get job logs.

This endpoint let user search job logs filtered by specific ID. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | Relevant job ID
try {
    apiInstance.jobsReplicationIdLogGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#jobsReplicationIdLogGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| Relevant job ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="jobsReplicationPut"></a>
# **jobsReplicationPut**
> jobsReplicationPut(body)

Update status of jobs. Only stop is supported for now.

The endpoint is used to stop the replication jobs of a policy. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
UpdateJobs body = new UpdateJobs(); // UpdateJobs | The policy ID and status.
try {
    apiInstance.jobsReplicationPut(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#jobsReplicationPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateJobs**](UpdateJobs.md)| The policy ID and status. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="jobsScanIdLogGet"></a>
# **jobsScanIdLogGet**
> jobsScanIdLogGet(id)

Get job logs.

This endpoint let user get scan job logs filtered by specific ID. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | Relevant job ID
try {
    apiInstance.jobsScanIdLogGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#jobsScanIdLogGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| Relevant job ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="labelsGet"></a>
# **labelsGet**
> List&lt;Label&gt; labelsGet(scope, name, projectId, page, pageSize)

List labels according to the query strings.

This endpoint let user list labels by name, scope and project_id 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String scope = "scope_example"; // String | The label scope. Valid values are g and p. g for global labels and p for project labels.
String name = "name_example"; // String | The label name.
Integer projectId = 56; // Integer | Relevant project ID, required when scope is p.
Integer page = 56; // Integer | The page nubmer.
Integer pageSize = 56; // Integer | The size of per page.
try {
    List<Label> result = apiInstance.labelsGet(scope, name, projectId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#labelsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | [**String**](.md)| The label scope. Valid values are g and p. g for global labels and p for project labels. |
 **name** | [**String**](.md)| The label name. | [optional]
 **projectId** | [**Integer**](.md)| Relevant project ID, required when scope is p. | [optional]
 **page** | [**Integer**](.md)| The page nubmer. | [optional]
 **pageSize** | [**Integer**](.md)| The size of per page. | [optional]

### Return type

[**List&lt;Label&gt;**](Label.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="labelsIdDelete"></a>
# **labelsIdDelete**
> labelsIdDelete(id)

Delete the label specified by ID.

Delete the label specified by ID. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | Label ID
try {
    apiInstance.labelsIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#labelsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| Label ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="labelsIdGet"></a>
# **labelsIdGet**
> Label labelsIdGet(id)

Get the label specified by ID.

This endpoint let user get the label by specific ID. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | Label ID
try {
    Label result = apiInstance.labelsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#labelsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| Label ID |

### Return type

[**Label**](Label.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="labelsIdPut"></a>
# **labelsIdPut**
> labelsIdPut(body, id)

Update the label properties.

This endpoint let user update label properties. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Label body = new Label(); // Label | The updated label json object.
Integer id = 56; // Integer | Label ID
try {
    apiInstance.labelsIdPut(body, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#labelsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Label**](Label.md)| The updated label json object. |
 **id** | [**Integer**](.md)| Label ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="labelsIdResourcesGet"></a>
# **labelsIdResourcesGet**
> Resource labelsIdResourcesGet(id)

Get the resources that the label is referenced by.

This endpoint let user get the resources that the label is referenced by. Only the replication policies are returned for now. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | Label ID
try {
    Resource result = apiInstance.labelsIdResourcesGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#labelsIdResourcesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| Label ID |

### Return type

[**Resource**](Resource.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="labelsPost"></a>
# **labelsPost**
> labelsPost(body)

Post creates a label

This endpoint let user creates a label. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Label body = new Label(); // Label | The json object of label.
try {
    apiInstance.labelsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#labelsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Label**](Label.md)| The json object of label. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ldapGroupsSearchGet"></a>
# **ldapGroupsSearchGet**
> List&lt;UserGroup&gt; ldapGroupsSearchGet(groupname, groupdn)

Search available ldap groups.

This endpoint searches the available ldap groups based on related configuration parameters. support to search by groupname or groupdn. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String groupname = "groupname_example"; // String | Ldap group name
String groupdn = "groupdn_example"; // String | The LDAP group DN
try {
    List<UserGroup> result = apiInstance.ldapGroupsSearchGet(groupname, groupdn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#ldapGroupsSearchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupname** | [**String**](.md)| Ldap group name | [optional]
 **groupdn** | [**String**](.md)| The LDAP group DN | [optional]

### Return type

[**List&lt;UserGroup&gt;**](UserGroup.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="ldapPingPost"></a>
# **ldapPingPost**
> ldapPingPost(body)

Ping available ldap service.

This endpoint ping the available ldap service for test related configuration parameters.  

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
LdapConf body = new LdapConf(); // LdapConf | ldap configuration. support input ldap service configuration. If it's a empty request, will load current configuration from the system.
try {
    apiInstance.ldapPingPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#ldapPingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LdapConf**](LdapConf.md)| ldap configuration. support input ldap service configuration. If it&#x27;s a empty request, will load current configuration from the system. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ldapUsersImportPost"></a>
# **ldapUsersImportPost**
> ldapUsersImportPost(body)

Import selected available ldap users.

This endpoint adds the selected available ldap users to harbor based on related configuration parameters from the system. System will try to guess the user email address and realname, add to harbor user information.  If have errors when import user, will return the list of importing failed uid and the failed reason. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
LdapImportUsers body = new LdapImportUsers(); // LdapImportUsers | The uid listed for importing. This list will check users validity of ldap service based on configuration from the system.
try {
    apiInstance.ldapUsersImportPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#ldapUsersImportPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LdapImportUsers**](LdapImportUsers.md)| The uid listed for importing. This list will check users validity of ldap service based on configuration from the system. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="ldapUsersSearchGet"></a>
# **ldapUsersSearchGet**
> List&lt;LdapUsers&gt; ldapUsersSearchGet(username)

Search available ldap users.

This endpoint searches the available ldap users based on related configuration parameters. Support searched by input ladp configuration, load configuration from the system and specific filter. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String username = "username_example"; // String | Registered user ID
try {
    List<LdapUsers> result = apiInstance.ldapUsersSearchGet(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#ldapUsersSearchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | [**String**](.md)| Registered user ID | [optional]

### Return type

[**List&lt;LdapUsers&gt;**](LdapUsers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="logsGet"></a>
# **logsGet**
> List&lt;AccessLog&gt; logsGet(username, repository, tag, operation, beginTimestamp, endTimestamp, page, pageSize)

Get recent logs of the projects which the user is a member of

This endpoint let user see the recent operation logs of the projects which he is member of  

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String username = "username_example"; // String | Username of the operator.
String repository = "repository_example"; // String | The name of repository
String tag = "tag_example"; // String | The name of tag
String operation = "operation_example"; // String | The operation
String beginTimestamp = "beginTimestamp_example"; // String | The begin timestamp
String endTimestamp = "endTimestamp_example"; // String | The end timestamp
Integer page = 56; // Integer | The page nubmer, default is 1.
Integer pageSize = 56; // Integer | The size of per page, default is 10, maximum is 100.
try {
    List<AccessLog> result = apiInstance.logsGet(username, repository, tag, operation, beginTimestamp, endTimestamp, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#logsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | [**String**](.md)| Username of the operator. | [optional]
 **repository** | [**String**](.md)| The name of repository | [optional]
 **tag** | [**String**](.md)| The name of tag | [optional]
 **operation** | [**String**](.md)| The operation | [optional]
 **beginTimestamp** | [**String**](.md)| The begin timestamp | [optional]
 **endTimestamp** | [**String**](.md)| The end timestamp | [optional]
 **page** | [**Integer**](.md)| The page nubmer, default is 1. | [optional]
 **pageSize** | [**Integer**](.md)| The size of per page, default is 10, maximum is 100. | [optional]

### Return type

[**List&lt;AccessLog&gt;**](AccessLog.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="policiesReplicationGet"></a>
# **policiesReplicationGet**
> List&lt;RepPolicy&gt; policiesReplicationGet(name, projectId, page, pageSize)

List filters policies by name and project_id

This endpoint let user list filters policies by name and project_id, if name and project_id are nil, list returns all policies 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String name = "name_example"; // String | The replication's policy name.
Integer projectId = 56; // Integer | Relevant project ID.
Integer page = 56; // Integer | The page nubmer.
Integer pageSize = 56; // Integer | The size of per page.
try {
    List<RepPolicy> result = apiInstance.policiesReplicationGet(name, projectId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#policiesReplicationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)| The replication&#x27;s policy name. | [optional]
 **projectId** | [**Integer**](.md)| Relevant project ID. | [optional]
 **page** | [**Integer**](.md)| The page nubmer. | [optional]
 **pageSize** | [**Integer**](.md)| The size of per page. | [optional]

### Return type

[**List&lt;RepPolicy&gt;**](RepPolicy.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="policiesReplicationIdDelete"></a>
# **policiesReplicationIdDelete**
> policiesReplicationIdDelete(id)

Delete the replication policy specified by ID.

Delete the replication policy specified by ID. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | Replication policy ID
try {
    apiInstance.policiesReplicationIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#policiesReplicationIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| Replication policy ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="policiesReplicationIdGet"></a>
# **policiesReplicationIdGet**
> RepPolicy policiesReplicationIdGet(id)

Get replication policy.

This endpoint let user search replication policy by specific ID. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | policy ID
try {
    RepPolicy result = apiInstance.policiesReplicationIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#policiesReplicationIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| policy ID |

### Return type

[**RepPolicy**](RepPolicy.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="policiesReplicationIdPut"></a>
# **policiesReplicationIdPut**
> policiesReplicationIdPut(body, id)

Put modifies name, description, target and enablement of policy.

This endpoint let user update policy name, description, target and enablement. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
RepPolicy body = new RepPolicy(); // RepPolicy | Updated properties of the replication policy.
Integer id = 56; // Integer | policy ID
try {
    apiInstance.policiesReplicationIdPut(body, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#policiesReplicationIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RepPolicy**](RepPolicy.md)| Updated properties of the replication policy. |
 **id** | [**Integer**](.md)| policy ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="policiesReplicationPost"></a>
# **policiesReplicationPost**
> policiesReplicationPost(body)

Post creates a policy

This endpoint let user creates a policy, and if it is enabled, the replication will be triggered right now. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
RepPolicy body = new RepPolicy(); // RepPolicy | Create new policy.
try {
    apiInstance.policiesReplicationPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#policiesReplicationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RepPolicy**](RepPolicy.md)| Create new policy. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="projectsGet"></a>
# **projectsGet**
> List&lt;Project&gt; projectsGet(name, _public, owner, page, pageSize)

List projects

This endpoint returns all projects created by Harbor, and can be filtered by project name. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String name = "name_example"; // String | The name of project.
Boolean _public = true; // Boolean | The project is public or private.
String owner = "owner_example"; // String | The name of project owner.
Integer page = 56; // Integer | The page nubmer, default is 1.
Integer pageSize = 56; // Integer | The size of per page, default is 10, maximum is 100.
try {
    List<Project> result = apiInstance.projectsGet(name, _public, owner, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)| The name of project. | [optional]
 **_public** | [**Boolean**](.md)| The project is public or private. | [optional]
 **owner** | [**String**](.md)| The name of project owner. | [optional]
 **page** | [**Integer**](.md)| The page nubmer, default is 1. | [optional]
 **pageSize** | [**Integer**](.md)| The size of per page, default is 10, maximum is 100. | [optional]

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="projectsHead"></a>
# **projectsHead**
> projectsHead(projectName)

Check if the project name user provided already exists.

This endpoint is used to check if the project name user provided already exist. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String projectName = "projectName_example"; // String | Project name for checking exists.
try {
    apiInstance.projectsHead(projectName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsHead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectName** | [**String**](.md)| Project name for checking exists. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="projectsPost"></a>
# **projectsPost**
> projectsPost(body)

Create a new project.

This endpoint is for user to create a new project. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
ProjectReq body = new ProjectReq(); // ProjectReq | New created project.
try {
    apiInstance.projectsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectReq**](ProjectReq.md)| New created project. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="projectsProjectIdDelete"></a>
# **projectsProjectIdDelete**
> projectsProjectIdDelete(projectId)

Delete project by projectID

This endpoint is aimed to delete project by project ID. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | Project ID of project which will be deleted.
try {
    apiInstance.projectsProjectIdDelete(projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| Project ID of project which will be deleted. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="projectsProjectIdGet"></a>
# **projectsProjectIdGet**
> Project projectsProjectIdGet(projectId)

Return specific project detail infomation

This endpoint returns specific project information by project ID. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | Project ID for filtering results.
try {
    Project result = apiInstance.projectsProjectIdGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| Project ID for filtering results. |

### Return type

[**Project**](Project.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdLogsGet"></a>
# **projectsProjectIdLogsGet**
> List&lt;AccessLog&gt; projectsProjectIdLogsGet(projectId, username, repository, tag, operation, beginTimestamp, endTimestamp, page, pageSize)

Get access logs accompany with a relevant project.

This endpoint let user search access logs filtered by operations and date time ranges. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | Relevant project ID
String username = "username_example"; // String | Username of the operator.
String repository = "repository_example"; // String | The name of repository
String tag = "tag_example"; // String | The name of tag
String operation = "operation_example"; // String | The operation
String beginTimestamp = "beginTimestamp_example"; // String | The begin timestamp
String endTimestamp = "endTimestamp_example"; // String | The end timestamp
Integer page = 56; // Integer | The page nubmer, default is 1.
Integer pageSize = 56; // Integer | The size of per page, default is 10, maximum is 100.
try {
    List<AccessLog> result = apiInstance.projectsProjectIdLogsGet(projectId, username, repository, tag, operation, beginTimestamp, endTimestamp, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdLogsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| Relevant project ID |
 **username** | [**String**](.md)| Username of the operator. | [optional]
 **repository** | [**String**](.md)| The name of repository | [optional]
 **tag** | [**String**](.md)| The name of tag | [optional]
 **operation** | [**String**](.md)| The operation | [optional]
 **beginTimestamp** | [**String**](.md)| The begin timestamp | [optional]
 **endTimestamp** | [**String**](.md)| The end timestamp | [optional]
 **page** | [**Integer**](.md)| The page nubmer, default is 1. | [optional]
 **pageSize** | [**Integer**](.md)| The size of per page, default is 10, maximum is 100. | [optional]

### Return type

[**List&lt;AccessLog&gt;**](AccessLog.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMembersGet"></a>
# **projectsProjectIdMembersGet**
> List&lt;ProjectMemberEntity&gt; projectsProjectIdMembersGet(projectId, entityname)

Get all project member information

Get all project member information

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | Relevant project ID.
String entityname = "entityname_example"; // String | The entity name to search.
try {
    List<ProjectMemberEntity> result = apiInstance.projectsProjectIdMembersGet(projectId, entityname);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMembersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| Relevant project ID. |
 **entityname** | [**String**](.md)| The entity name to search. | [optional]

### Return type

[**List&lt;ProjectMemberEntity&gt;**](ProjectMemberEntity.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMembersMidDelete"></a>
# **projectsProjectIdMembersMidDelete**
> projectsProjectIdMembersMidDelete(projectId, mid)

Delete project member

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | Relevant project ID.
Integer mid = 56; // Integer | Member ID.
try {
    apiInstance.projectsProjectIdMembersMidDelete(projectId, mid);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMembersMidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| Relevant project ID. |
 **mid** | [**Integer**](.md)| Member ID. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="projectsProjectIdMembersMidGet"></a>
# **projectsProjectIdMembersMidGet**
> ProjectMemberEntity projectsProjectIdMembersMidGet(projectId, mid)

Get the project member information

Get the project member information

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | Relevant project ID.
Integer mid = 56; // Integer | The member ID
try {
    ProjectMemberEntity result = apiInstance.projectsProjectIdMembersMidGet(projectId, mid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMembersMidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| Relevant project ID. |
 **mid** | [**Integer**](.md)| The member ID |

### Return type

[**ProjectMemberEntity**](ProjectMemberEntity.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMembersMidPut"></a>
# **projectsProjectIdMembersMidPut**
> projectsProjectIdMembersMidPut(projectId, mid, body)

Update project member

Update project member relationship

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | Relevant project ID.
Integer mid = 56; // Integer | Member ID.
RoleRequest body = new RoleRequest(); // RoleRequest | 
try {
    apiInstance.projectsProjectIdMembersMidPut(projectId, mid, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMembersMidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| Relevant project ID. |
 **mid** | [**Integer**](.md)| Member ID. |
 **body** | [**RoleRequest**](RoleRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="projectsProjectIdMembersPost"></a>
# **projectsProjectIdMembersPost**
> projectsProjectIdMembersPost(projectId, body)

Create project member

Create project member relationship, the member can be one of the user_member and group_member,  The user_member need to specify user_id or username. If the user already exist in harbor DB, specify the user_id,  If does not exist in harbor DB, it will SearchAndOnBoard the user. The group_member need to specify id or ldap_group_dn. If the group already exist in harbor DB. specify the user group&#x27;s id,  If does not exist, it will SearchAndOnBoard the group. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | Relevant project ID.
ProjectMember body = new ProjectMember(); // ProjectMember | 
try {
    apiInstance.projectsProjectIdMembersPost(projectId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMembersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| Relevant project ID. |
 **body** | [**ProjectMember**](ProjectMember.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="projectsProjectIdMetadatasGet"></a>
# **projectsProjectIdMetadatasGet**
> ProjectMetadata projectsProjectIdMetadatasGet(projectId)

Get project metadata.

This endpoint returns metadata of the project specified by project ID. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | The ID of project.
try {
    ProjectMetadata result = apiInstance.projectsProjectIdMetadatasGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMetadatasGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| The ID of project. |

### Return type

[**ProjectMetadata**](ProjectMetadata.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMetadatasMetaNameDelete"></a>
# **projectsProjectIdMetadatasMetaNameDelete**
> projectsProjectIdMetadatasMetaNameDelete(projectId, metaName)

Delete metadata of a project

This endpoint is aimed to delete metadata of a project. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | The ID of project.
String metaName = "metaName_example"; // String | The name of metadat.
try {
    apiInstance.projectsProjectIdMetadatasMetaNameDelete(projectId, metaName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMetadatasMetaNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| The ID of project. |
 **metaName** | [**String**](.md)| The name of metadat. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="projectsProjectIdMetadatasMetaNameGet"></a>
# **projectsProjectIdMetadatasMetaNameGet**
> ProjectMetadata projectsProjectIdMetadatasMetaNameGet(projectId, metaName)

Get project metadata

This endpoint returns specified metadata of a project. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | Project ID for filtering results.
String metaName = "metaName_example"; // String | The name of metadat.
try {
    ProjectMetadata result = apiInstance.projectsProjectIdMetadatasMetaNameGet(projectId, metaName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMetadatasMetaNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| Project ID for filtering results. |
 **metaName** | [**String**](.md)| The name of metadat. |

### Return type

[**ProjectMetadata**](ProjectMetadata.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMetadatasMetaNamePut"></a>
# **projectsProjectIdMetadatasMetaNamePut**
> projectsProjectIdMetadatasMetaNamePut(projectId, metaName)

Update metadata of a project.

This endpoint is aimed to update the metadata of a project. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | The ID of project.
String metaName = "metaName_example"; // String | The name of metadat.
try {
    apiInstance.projectsProjectIdMetadatasMetaNamePut(projectId, metaName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMetadatasMetaNamePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| The ID of project. |
 **metaName** | [**String**](.md)| The name of metadat. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="projectsProjectIdMetadatasPost"></a>
# **projectsProjectIdMetadatasPost**
> projectsProjectIdMetadatasPost(body, projectId)

Add metadata for the project.

This endpoint is aimed to add metadata of a project. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
ProjectMetadata body = new ProjectMetadata(); // ProjectMetadata | The metadata of project.
Integer projectId = 56; // Integer | Selected project ID.
try {
    apiInstance.projectsProjectIdMetadatasPost(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMetadatasPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectMetadata**](ProjectMetadata.md)| The metadata of project. |
 **projectId** | [**Integer**](.md)| Selected project ID. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="projectsProjectIdPut"></a>
# **projectsProjectIdPut**
> projectsProjectIdPut(body, projectId)

Update properties for a selected project.

This endpoint is aimed to update the properties of a project. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
ProjectReq body = new ProjectReq(); // ProjectReq | Updates of project.
Integer projectId = 56; // Integer | Selected project ID.
try {
    apiInstance.projectsProjectIdPut(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectReq**](ProjectReq.md)| Updates of project. |
 **projectId** | [**Integer**](.md)| Selected project ID. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="replicationsPost"></a>
# **replicationsPost**
> ReplicationResponse replicationsPost(body)

Trigger the replication according to the specified policy.

This endpoint is used to trigger a replication. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Replication body = new Replication(); // Replication | The ID of replication policy.
try {
    ReplicationResponse result = apiInstance.replicationsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#replicationsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Replication**](Replication.md)| The ID of replication policy. |

### Return type

[**ReplicationResponse**](ReplicationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesGet"></a>
# **repositoriesGet**
> List&lt;Repository&gt; repositoriesGet(projectId, q, sort, labelId, page, pageSize)

Get repositories accompany with relevant project and repo name.

This endpoint lets user search repositories accompanying with relevant project ID and repo name. Repositories can be sorted by repo name, creation_time, update_time in either ascending or descending order. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | Relevant project ID.
String q = "q_example"; // String | Repo name for filtering results.
String sort = "sort_example"; // String | Sort method, valid values include: 'name', '-name', 'creation_time', '-creation_time', 'update_time', '-update_time'. Here '-' stands for descending order. 
Integer labelId = 56; // Integer | The ID of label used to filter the result.
Integer page = 56; // Integer | The page nubmer, default is 1.
Integer pageSize = 56; // Integer | The size of per page, default is 10, maximum is 100.
try {
    List<Repository> result = apiInstance.repositoriesGet(projectId, q, sort, labelId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| Relevant project ID. |
 **q** | [**String**](.md)| Repo name for filtering results. | [optional]
 **sort** | [**String**](.md)| Sort method, valid values include: &#x27;name&#x27;, &#x27;-name&#x27;, &#x27;creation_time&#x27;, &#x27;-creation_time&#x27;, &#x27;update_time&#x27;, &#x27;-update_time&#x27;. Here &#x27;-&#x27; stands for descending order.  | [optional]
 **labelId** | [**Integer**](.md)| The ID of label used to filter the result. | [optional]
 **page** | [**Integer**](.md)| The page nubmer, default is 1. | [optional]
 **pageSize** | [**Integer**](.md)| The size of per page, default is 10, maximum is 100. | [optional]

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameDelete"></a>
# **repositoriesRepoNameDelete**
> repositoriesRepoNameDelete(repoName)

Delete a repository.

This endpoint let user delete a repository with name. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository which will be deleted.
try {
    apiInstance.repositoriesRepoNameDelete(repoName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | [**String**](.md)| The name of repository which will be deleted. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesRepoNameLabelsGet"></a>
# **repositoriesRepoNameLabelsGet**
> List&lt;Label&gt; repositoriesRepoNameLabelsGet(repoName)

Get labels of a repository.

Get labels of a repository specified by the repo_name. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository.
try {
    List<Label> result = apiInstance.repositoriesRepoNameLabelsGet(repoName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameLabelsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | [**String**](.md)| The name of repository. |

### Return type

[**List&lt;Label&gt;**](Label.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameLabelsLabelIdDelete"></a>
# **repositoriesRepoNameLabelsLabelIdDelete**
> repositoriesRepoNameLabelsLabelIdDelete(repoName, labelId)

Delete label from the repository.

Delete the label from the repository specified by the repo_name. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository.
Integer labelId = 56; // Integer | The ID of label.
try {
    apiInstance.repositoriesRepoNameLabelsLabelIdDelete(repoName, labelId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameLabelsLabelIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | [**String**](.md)| The name of repository. |
 **labelId** | [**Integer**](.md)| The ID of label. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesRepoNameLabelsPost"></a>
# **repositoriesRepoNameLabelsPost**
> repositoriesRepoNameLabelsPost(body, repoName)

Add a label to the repository.

Add a label to the repository. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Label body = new Label(); // Label | Only the ID property is required.
String repoName = "repoName_example"; // String | The name of repository.
try {
    apiInstance.repositoriesRepoNameLabelsPost(body, repoName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameLabelsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Label**](Label.md)| Only the ID property is required. |
 **repoName** | [**String**](.md)| The name of repository. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="repositoriesRepoNamePut"></a>
# **repositoriesRepoNamePut**
> repositoriesRepoNamePut(body, repoName)

Update description of the repository.

This endpoint is used to update description of the repository. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
RepositoryDescription body = new RepositoryDescription(); // RepositoryDescription | The description of the repository.
String repoName = "repoName_example"; // String | The name of repository which will be deleted.
try {
    apiInstance.repositoriesRepoNamePut(body, repoName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNamePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RepositoryDescription**](RepositoryDescription.md)| The description of the repository. |
 **repoName** | [**String**](.md)| The name of repository which will be deleted. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="repositoriesRepoNameSignaturesGet"></a>
# **repositoriesRepoNameSignaturesGet**
> List&lt;RepoSignature&gt; repositoriesRepoNameSignaturesGet(repoName)

Get signature information of a repository

This endpoint aims to retrieve signature information of a repository, the data is from the nested notary instance of Harbor. If the repository does not have any signature information in notary, this API will return an empty list with response code 200, instead of 404 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | repository name.
try {
    List<RepoSignature> result = apiInstance.repositoriesRepoNameSignaturesGet(repoName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameSignaturesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | [**String**](.md)| repository name. |

### Return type

[**List&lt;RepoSignature&gt;**](RepoSignature.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsGet"></a>
# **repositoriesRepoNameTagsGet**
> List&lt;DetailedTag&gt; repositoriesRepoNameTagsGet(repoName, labelIds)

Get tags of a relevant repository.

This endpoint aims to retrieve tags from a relevant repository. If deployed with Notary, the signature property of response represents whether the image is singed or not. If the property is null, the image is unsigned. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | Relevant repository name.
String labelIds = "labelIds_example"; // String | A list of comma separated label IDs.
try {
    List<DetailedTag> result = apiInstance.repositoriesRepoNameTagsGet(repoName, labelIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | [**String**](.md)| Relevant repository name. |
 **labelIds** | [**String**](.md)| A list of comma separated label IDs. | [optional]

### Return type

[**List&lt;DetailedTag&gt;**](DetailedTag.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsPost"></a>
# **repositoriesRepoNameTagsPost**
> repositoriesRepoNameTagsPost(body, repoName)

Retag an image

This endpoint tags an existing image with another tag in this repo, source images can be in different repos or projects. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
RetagReq body = new RetagReq(); // RetagReq | Request to give source image and target tag.
String repoName = "repoName_example"; // String | Relevant repository name.
try {
    apiInstance.repositoriesRepoNameTagsPost(body, repoName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RetagReq**](RetagReq.md)| Request to give source image and target tag. |
 **repoName** | [**String**](.md)| Relevant repository name. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="repositoriesRepoNameTagsTagDelete"></a>
# **repositoriesRepoNameTagsTagDelete**
> repositoriesRepoNameTagsTagDelete(repoName, tag)

Delete a tag in a repository.

This endpoint let user delete tags with repo name and tag. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository which will be deleted.
String tag = "tag_example"; // String | Tag of a repository.
try {
    apiInstance.repositoriesRepoNameTagsTagDelete(repoName, tag);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | [**String**](.md)| The name of repository which will be deleted. |
 **tag** | [**String**](.md)| Tag of a repository. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesRepoNameTagsTagGet"></a>
# **repositoriesRepoNameTagsTagGet**
> DetailedTag repositoriesRepoNameTagsTagGet(repoName, tag)

Get the tag of the repository.

This endpoint aims to retrieve the tag of the repository. If deployed with Notary, the signature property of response represents whether the image is singed or not. If the property is null, the image is unsigned. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | Relevant repository name.
String tag = "tag_example"; // String | Tag of the repository.
try {
    DetailedTag result = apiInstance.repositoriesRepoNameTagsTagGet(repoName, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | [**String**](.md)| Relevant repository name. |
 **tag** | [**String**](.md)| Tag of the repository. |

### Return type

[**DetailedTag**](DetailedTag.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsTagLabelsGet"></a>
# **repositoriesRepoNameTagsTagLabelsGet**
> List&lt;Label&gt; repositoriesRepoNameTagsTagLabelsGet(repoName, tag)

Get labels of an image.

Get labels of an image specified by the repo_name and tag. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository.
String tag = "tag_example"; // String | The tag of the image.
try {
    List<Label> result = apiInstance.repositoriesRepoNameTagsTagLabelsGet(repoName, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagLabelsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | [**String**](.md)| The name of repository. |
 **tag** | [**String**](.md)| The tag of the image. |

### Return type

[**List&lt;Label&gt;**](Label.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsTagLabelsLabelIdDelete"></a>
# **repositoriesRepoNameTagsTagLabelsLabelIdDelete**
> repositoriesRepoNameTagsTagLabelsLabelIdDelete(repoName, tag, labelId)

Delete label from the image.

Delete the label from the image specified by the repo_name and tag. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository.
String tag = "tag_example"; // String | The tag of the image.
Integer labelId = 56; // Integer | The ID of label.
try {
    apiInstance.repositoriesRepoNameTagsTagLabelsLabelIdDelete(repoName, tag, labelId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagLabelsLabelIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | [**String**](.md)| The name of repository. |
 **tag** | [**String**](.md)| The tag of the image. |
 **labelId** | [**Integer**](.md)| The ID of label. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesRepoNameTagsTagLabelsPost"></a>
# **repositoriesRepoNameTagsTagLabelsPost**
> repositoriesRepoNameTagsTagLabelsPost(body, repoName, tag)

Add a label to image.

Add a label to the image. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Label body = new Label(); // Label | Only the ID property is required.
String repoName = "repoName_example"; // String | The name of repository.
String tag = "tag_example"; // String | The tag of the image.
try {
    apiInstance.repositoriesRepoNameTagsTagLabelsPost(body, repoName, tag);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagLabelsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Label**](Label.md)| Only the ID property is required. |
 **repoName** | [**String**](.md)| The name of repository. |
 **tag** | [**String**](.md)| The tag of the image. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="repositoriesRepoNameTagsTagManifestGet"></a>
# **repositoriesRepoNameTagsTagManifestGet**
> Manifest repositoriesRepoNameTagsTagManifestGet(repoName, tag, version)

Get manifests of a relevant repository.

This endpoint aims to retreive manifests from a relevant repository. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | Repository name
String tag = "tag_example"; // String | Tag name
String version = "version_example"; // String | The version of manifest, valid value are \"v1\" and \"v2\", default is \"v2\"
try {
    Manifest result = apiInstance.repositoriesRepoNameTagsTagManifestGet(repoName, tag, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagManifestGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | [**String**](.md)| Repository name |
 **tag** | [**String**](.md)| Tag name |
 **version** | [**String**](.md)| The version of manifest, valid value are \&quot;v1\&quot; and \&quot;v2\&quot;, default is \&quot;v2\&quot; | [optional]

### Return type

[**Manifest**](Manifest.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsTagScanPost"></a>
# **repositoriesRepoNameTagsTagScanPost**
> repositoriesRepoNameTagsTagScanPost(repoName, tag)

Scan the image.

Trigger jobservice to call Clair API to scan the image identified by the repo_name and tag.  Only project admins have permission to scan images under the project. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | Repository name
String tag = "tag_example"; // String | Tag name
try {
    apiInstance.repositoriesRepoNameTagsTagScanPost(repoName, tag);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagScanPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | [**String**](.md)| Repository name |
 **tag** | [**String**](.md)| Tag name |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesRepoNameTagsTagVulnerabilityDetailsGet"></a>
# **repositoriesRepoNameTagsTagVulnerabilityDetailsGet**
> List&lt;VulnerabilityItem&gt; repositoriesRepoNameTagsTagVulnerabilityDetailsGet(repoName, tag)

Get vulnerability details of the image.

Call Clair API to get the vulnerability based on the previous successful scan. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | Repository name
String tag = "tag_example"; // String | Tag name
try {
    List<VulnerabilityItem> result = apiInstance.repositoriesRepoNameTagsTagVulnerabilityDetailsGet(repoName, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagVulnerabilityDetailsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | [**String**](.md)| Repository name |
 **tag** | [**String**](.md)| Tag name |

### Return type

[**List&lt;VulnerabilityItem&gt;**](VulnerabilityItem.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="repositoriesScanAllPost"></a>
# **repositoriesScanAllPost**
> repositoriesScanAllPost(projectId)

Scan all images of the registry.

The server will launch different jobs to scan each image on the regsitry, so this is equivalent to calling  the API to scan the image one by one in background, so there&#x27;s no way to track the overall status of the \&quot;scan all\&quot; action.  Only system adim has permission to call this API.   

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | When this parm is set only the images under the project identified by the project_id will be scanned.
try {
    apiInstance.repositoriesScanAllPost(projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesScanAllPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**Integer**](.md)| When this parm is set only the images under the project identified by the project_id will be scanned. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesTopGet"></a>
# **repositoriesTopGet**
> List&lt;Repository&gt; repositoriesTopGet(count)

Get public repositories which are accessed most.

This endpoint aims to let users see the most popular public repositories 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer count = 56; // Integer | The number of the requested public repositories, default is 10 if not provided.
try {
    List<Repository> result = apiInstance.repositoriesTopGet(count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesTopGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | [**Integer**](.md)| The number of the requested public repositories, default is 10 if not provided. | [optional]

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="searchGet"></a>
# **searchGet**
> List&lt;Search&gt; searchGet(q)

Search for projects, repositories and helm charts

The Search endpoint returns information about the projects ,repositories  and helm charts offered at public status or related to the current logged in user. The response includes the project, repository list and charts in a proper display order. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String q = "q_example"; // String | Search parameter for project and repository name.
try {
    List<Search> result = apiInstance.searchGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#searchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**String**](.md)| Search parameter for project and repository name. |

### Return type

[**List&lt;Search&gt;**](Search.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="statisticsGet"></a>
# **statisticsGet**
> StatisticMap statisticsGet()

Get projects number and repositories number relevant to the user

This endpoint is aimed to statistic all of the projects number and repositories number relevant to the logined user, also the public projects number and repositories number. If the user is admin, he can also get total projects number and total repositories number. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    StatisticMap result = apiInstance.statisticsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#statisticsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatisticMap**](StatisticMap.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="systemGcGet"></a>
# **systemGcGet**
> List&lt;GCResult&gt; systemGcGet()

Get gc results.

This endpoint let user get latest ten gc results.

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    List<GCResult> result = apiInstance.systemGcGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemGcGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GCResult&gt;**](GCResult.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="systemGcIdGet"></a>
# **systemGcIdGet**
> List&lt;GCResult&gt; systemGcIdGet(id)

Get gc status.

This endpoint let user get gc status filtered by specific ID.

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | Relevant job ID
try {
    List<GCResult> result = apiInstance.systemGcIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemGcIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| Relevant job ID |

### Return type

[**List&lt;GCResult&gt;**](GCResult.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="systemGcIdLogGet"></a>
# **systemGcIdLogGet**
> String systemGcIdLogGet(id)

Get gc job log.

This endpoint let user get gc job logs filtered by specific ID.

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | Relevant job ID
try {
    String result = apiInstance.systemGcIdLogGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemGcIdLogGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| Relevant job ID |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="systemGcScheduleGet"></a>
# **systemGcScheduleGet**
> List&lt;GCSchedule&gt; systemGcScheduleGet()

Get gc&#x27;s schedule.

This endpoint is for get schedule of gc job.

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    List<GCSchedule> result = apiInstance.systemGcScheduleGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemGcScheduleGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GCSchedule&gt;**](GCSchedule.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="systemGcSchedulePost"></a>
# **systemGcSchedulePost**
> systemGcSchedulePost(body)

Create a gc schedule.

This endpoint is for update gc schedule. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
GCSchedule body = new GCSchedule(); // GCSchedule | Updates of gs's schedule.
try {
    apiInstance.systemGcSchedulePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemGcSchedulePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GCSchedule**](GCSchedule.md)| Updates of gs&#x27;s schedule. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="systemGcSchedulePut"></a>
# **systemGcSchedulePut**
> systemGcSchedulePut(body)

Update gc&#x27;s schedule.

This endpoint is for update gc schedule. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
GCSchedule body = new GCSchedule(); // GCSchedule | Updates of gs's schedule.
try {
    apiInstance.systemGcSchedulePut(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemGcSchedulePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GCSchedule**](GCSchedule.md)| Updates of gs&#x27;s schedule. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="systeminfoGet"></a>
# **systeminfoGet**
> GeneralInfo systeminfoGet()

Get general system info

This API is for retrieving general system info, this can be called by anonymous request. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    GeneralInfo result = apiInstance.systeminfoGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systeminfoGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GeneralInfo**](GeneralInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="systeminfoGetcertGet"></a>
# **systeminfoGetcertGet**
> systeminfoGetcertGet()

Get default root certificate.

This endpoint is for downloading a default root certificate. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    apiInstance.systeminfoGetcertGet();
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systeminfoGetcertGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="systeminfoVolumesGet"></a>
# **systeminfoVolumesGet**
> SystemInfo systeminfoVolumesGet()

Get system volume info (total/free size).

This endpoint is for retrieving system volume info that only provides for admin user. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    SystemInfo result = apiInstance.systeminfoVolumesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systeminfoVolumesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemInfo**](SystemInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="targetsGet"></a>
# **targetsGet**
> List&lt;RepTarget&gt; targetsGet(name)

List filters targets by name.

This endpoint let user list filters targets by name, if name is nil, list returns all targets. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String name = "name_example"; // String | The replication's target name.
try {
    List<RepTarget> result = apiInstance.targetsGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#targetsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)| The replication&#x27;s target name. | [optional]

### Return type

[**List&lt;RepTarget&gt;**](RepTarget.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="targetsIdDelete"></a>
# **targetsIdDelete**
> targetsIdDelete(id)

Delete specific replication&#x27;s target.

This endpoint is for to delete specific replication&#x27;s target. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | The replication's target ID.
try {
    apiInstance.targetsIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#targetsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| The replication&#x27;s target ID. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="targetsIdGet"></a>
# **targetsIdGet**
> RepTarget targetsIdGet(id)

Get replication&#x27;s target.

This endpoint is for get specific replication&#x27;s target.

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | The replication's target ID.
try {
    RepTarget result = apiInstance.targetsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#targetsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| The replication&#x27;s target ID. |

### Return type

[**RepTarget**](RepTarget.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="targetsIdPoliciesGet"></a>
# **targetsIdPoliciesGet**
> List&lt;RepPolicy&gt; targetsIdPoliciesGet(id)

List the target relevant policies.

This endpoint list policies filter with specific replication&#x27;s target ID. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | The replication's target ID.
try {
    List<RepPolicy> result = apiInstance.targetsIdPoliciesGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#targetsIdPoliciesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| The replication&#x27;s target ID. |

### Return type

[**List&lt;RepPolicy&gt;**](RepPolicy.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="targetsIdPut"></a>
# **targetsIdPut**
> targetsIdPut(body, id)

Update replication&#x27;s target.

This endpoint is for update specific replication&#x27;s target. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
PutTarget body = new PutTarget(); // PutTarget | Updates of replication's target.
Integer id = 56; // Integer | The replication's target ID.
try {
    apiInstance.targetsIdPut(body, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#targetsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutTarget**](PutTarget.md)| Updates of replication&#x27;s target. |
 **id** | [**Integer**](.md)| The replication&#x27;s target ID. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="targetsPingPost"></a>
# **targetsPingPost**
> targetsPingPost(body)

Ping validates target.

This endpoint is for ping validates whether the target is reachable and whether the credential is valid. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
PingTarget body = new PingTarget(); // PingTarget | The target object.
try {
    apiInstance.targetsPingPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#targetsPingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PingTarget**](PingTarget.md)| The target object. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="targetsPost"></a>
# **targetsPost**
> targetsPost(body)

Create a new replication target.

This endpoint is for user to create a new replication target. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
RepTargetPost body = new RepTargetPost(); // RepTargetPost | New created replication target.
try {
    apiInstance.targetsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#targetsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RepTargetPost**](RepTargetPost.md)| New created replication target. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="usergroupsGet"></a>
# **usergroupsGet**
> List&lt;UserGroup&gt; usergroupsGet()

Get all user groups information

Get all user groups information

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    List<UserGroup> result = apiInstance.usergroupsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usergroupsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserGroup&gt;**](UserGroup.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="usergroupsGroupIdDelete"></a>
# **usergroupsGroupIdDelete**
> usergroupsGroupIdDelete(groupId)

Delete user group

Delete user group

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer groupId = 56; // Integer | 
try {
    apiInstance.usergroupsGroupIdDelete(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usergroupsGroupIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**Integer**](.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usergroupsGroupIdGet"></a>
# **usergroupsGroupIdGet**
> UserGroup usergroupsGroupIdGet(groupId)

Get user group information

Get user group information

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer groupId = 56; // Integer | Group ID
try {
    UserGroup result = apiInstance.usergroupsGroupIdGet(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usergroupsGroupIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**Integer**](.md)| Group ID |

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="usergroupsGroupIdPut"></a>
# **usergroupsGroupIdPut**
> usergroupsGroupIdPut(groupId, body)

Update group information

Update user group information

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer groupId = 56; // Integer | Group ID
UserGroup body = new UserGroup(); // UserGroup | 
try {
    apiInstance.usergroupsGroupIdPut(groupId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usergroupsGroupIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**Integer**](.md)| Group ID |
 **body** | [**UserGroup**](UserGroup.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="usergroupsPost"></a>
# **usergroupsPost**
> usergroupsPost(body)

Create user group

Create user group information

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
UserGroup body = new UserGroup(); // UserGroup | 
try {
    apiInstance.usergroupsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usergroupsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserGroup**](UserGroup.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="usersCurrentGet"></a>
# **usersCurrentGet**
> User usersCurrentGet()

Get current user info.

This endpoint is to get the current user infomation. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    User result = apiInstance.usersCurrentGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersCurrentGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="usersGet"></a>
# **usersGet**
> List&lt;User&gt; usersGet(username, email, page, pageSize)

Get registered users of Harbor.

This endpoint is for user to search registered users, support for filtering results with username.Notice, by now this operation is only for administrator. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String username = "username_example"; // String | Username for filtering results.
String email = "email_example"; // String | Email for filtering results.
Integer page = 56; // Integer | The page nubmer, default is 1.
Integer pageSize = 56; // Integer | The size of per page.
try {
    List<User> result = apiInstance.usersGet(username, email, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | [**String**](.md)| Username for filtering results. | [optional]
 **email** | [**String**](.md)| Email for filtering results. | [optional]
 **page** | [**Integer**](.md)| The page nubmer, default is 1. | [optional]
 **pageSize** | [**Integer**](.md)| The size of per page. | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="usersPost"></a>
# **usersPost**
> usersPost(body)

Creates a new user account.

This endpoint is to create a user if the user does not already exist. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
User body = new User(); // User | New created user.
try {
    apiInstance.usersPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| New created user. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="usersUserIdDelete"></a>
# **usersUserIdDelete**
> usersUserIdDelete(userId)

Mark a registered user as be removed.

This endpoint let administrator of Harbor mark a registered user as be removed.It actually won&#x27;t be deleted from DB. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer userId = 56; // Integer | User ID for marking as to be removed.
try {
    apiInstance.usersUserIdDelete(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersUserIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| User ID for marking as to be removed. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdGet"></a>
# **usersUserIdGet**
> User usersUserIdGet(userId)

Get a user&#x27;s profile.

Get user&#x27;s profile with user id. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer userId = 56; // Integer | Registered user ID
try {
    User result = apiInstance.usersUserIdGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersUserIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| Registered user ID |

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="usersUserIdPasswordPut"></a>
# **usersUserIdPasswordPut**
> usersUserIdPasswordPut(body, userId)

Change the password on a user that already exists.

This endpoint is for user to update password. Users with the admin role can change any user&#x27;s password. Guest users can change only their own password. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Password body = new Password(); // Password | Password to be updated, the attribute 'old_password' is optional when the API is called by the system administrator.
Integer userId = 56; // Integer | Registered user ID.
try {
    apiInstance.usersUserIdPasswordPut(body, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersUserIdPasswordPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Password**](Password.md)| Password to be updated, the attribute &#x27;old_password&#x27; is optional when the API is called by the system administrator. |
 **userId** | [**Integer**](.md)| Registered user ID. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="usersUserIdPut"></a>
# **usersUserIdPut**
> usersUserIdPut(body, userId)

Update a registered user to change his profile.

This endpoint let a registered user change his profile. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
UserProfile body = new UserProfile(); // UserProfile | Only email, realname and comment can be modified.
Integer userId = 56; // Integer | Registered user ID
try {
    apiInstance.usersUserIdPut(body, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersUserIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserProfile**](UserProfile.md)| Only email, realname and comment can be modified. |
 **userId** | [**Integer**](.md)| Registered user ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="usersUserIdSysadminPut"></a>
# **usersUserIdSysadminPut**
> usersUserIdSysadminPut(body, userId)

Update a registered user to change to be an administrator of Harbor.

This endpoint let a registered user change to be an administrator of Harbor. 

### Example
```java
// Import classes:
//import com.imwyh.harbor.client.ApiClient;
//import com.imwyh.harbor.client.ApiException;
//import com.imwyh.harbor.client.Configuration;
//import com.imwyh.harbor.client.auth.*;
//import com.imwyh.harbor.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
HasAdminRole body = new HasAdminRole(); // HasAdminRole | Toggle a user to admin or not.
Integer userId = 56; // Integer | Registered user ID
try {
    apiInstance.usersUserIdSysadminPut(body, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersUserIdSysadminPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HasAdminRole**](HasAdminRole.md)| Toggle a user to admin or not. |
 **userId** | [**Integer**](.md)| Registered user ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

