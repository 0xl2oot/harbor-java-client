# ChartRepositoryApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chartrepoChartsPost**](ChartRepositoryApi.md#chartrepoChartsPost) | **POST** /chartrepo/charts | Upload a chart file to the defult &#x27;library&#x27; project.
[**chartrepoHealthGet**](ChartRepositoryApi.md#chartrepoHealthGet) | **GET** /chartrepo/health | Check the health of chart repository service.
[**chartrepoRepoChartsGet**](ChartRepositoryApi.md#chartrepoRepoChartsGet) | **GET** /chartrepo/{repo}/charts | Get all the charts under the specified project
[**chartrepoRepoChartsNameDelete**](ChartRepositoryApi.md#chartrepoRepoChartsNameDelete) | **DELETE** /chartrepo/{repo}/charts/{name} | Delete all the versions of the specified chart
[**chartrepoRepoChartsNameGet**](ChartRepositoryApi.md#chartrepoRepoChartsNameGet) | **GET** /chartrepo/{repo}/charts/{name} | Get all the versions of the specified chart
[**chartrepoRepoChartsNameVersionDelete**](ChartRepositoryApi.md#chartrepoRepoChartsNameVersionDelete) | **DELETE** /chartrepo/{repo}/charts/{name}/{version} | Delete the specified chart version
[**chartrepoRepoChartsNameVersionGet**](ChartRepositoryApi.md#chartrepoRepoChartsNameVersionGet) | **GET** /chartrepo/{repo}/charts/{name}/{version} | Get the specified chart version
[**chartrepoRepoChartsPost**](ChartRepositoryApi.md#chartrepoRepoChartsPost) | **POST** /chartrepo/{repo}/charts | Upload a chart file to the specified project.
[**chartrepoRepoProvPost**](ChartRepositoryApi.md#chartrepoRepoProvPost) | **POST** /chartrepo/{repo}/prov | Upload a provance file to the specified project.
[**chartreporepoChartsnameversionLabelsGet**](ChartRepositoryApi.md#chartreporepoChartsnameversionLabelsGet) | **GET** /chartrepo/:repo/charts/:name/:version/labels | Return the attahced labels of chart.
[**chartreporepoChartsnameversionLabelsPost**](ChartRepositoryApi.md#chartreporepoChartsnameversionLabelsPost) | **POST** /chartrepo/:repo/charts/:name/:version/labels | Mark label to chart.
[**chartreporepoChartsnameversionLabelsidDelete**](ChartRepositoryApi.md#chartreporepoChartsnameversionLabelsidDelete) | **DELETE** /chartrepo/:repo/charts/:name/:version/labels/:id | Remove label from chart.

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
//import com.imwyh.harbor.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
File chart = new File("chart_example"); // File | 
File prov = new File("prov_example"); // File | 
try {
    apiInstance.chartrepoChartsPost(chart, prov);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoChartsPost");
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
//import com.imwyh.harbor.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
try {
    Object result = apiInstance.chartrepoHealthGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoHealthGet");
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
//import com.imwyh.harbor.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
try {
    List<ChartInfoEntry> result = apiInstance.chartrepoRepoChartsGet(repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsGet");
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
//import com.imwyh.harbor.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
try {
    apiInstance.chartrepoRepoChartsNameDelete(repo, name);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsNameDelete");
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
//import com.imwyh.harbor.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
try {
    apiInstance.chartrepoRepoChartsNameGet(repo, name);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsNameGet");
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
//import com.imwyh.harbor.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartrepoRepoChartsNameVersionDelete(repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsNameVersionDelete");
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
//import com.imwyh.harbor.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartrepoRepoChartsNameVersionGet(repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsNameVersionGet");
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
//import com.imwyh.harbor.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
File chart = new File("chart_example"); // File | 
File prov = new File("prov_example"); // File | 
try {
    apiInstance.chartrepoRepoChartsPost(repo, chart, prov);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsPost");
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
//import com.imwyh.harbor.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
File prov = new File("prov_example"); // File | 
try {
    apiInstance.chartrepoRepoProvPost(repo, prov);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoProvPost");
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
//import com.imwyh.harbor.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartreporepoChartsnameversionLabelsGet(repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartreporepoChartsnameversionLabelsGet");
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
//import com.imwyh.harbor.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
Label body = new Label(); // Label | The label being marked to the chart version
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartreporepoChartsnameversionLabelsPost(body, repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartreporepoChartsnameversionLabelsPost");
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
//import com.imwyh.harbor.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
Integer id = 56; // Integer | The label ID
try {
    apiInstance.chartreporepoChartsnameversionLabelsidDelete(repo, name, version, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartreporepoChartsnameversionLabelsidDelete");
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

