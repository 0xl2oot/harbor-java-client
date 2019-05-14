# LabelApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chartreporepoChartsnameversionLabelsGet**](LabelApi.md#chartreporepoChartsnameversionLabelsGet) | **GET** /chartrepo/:repo/charts/:name/:version/labels | Return the attahced labels of chart.
[**chartreporepoChartsnameversionLabelsPost**](LabelApi.md#chartreporepoChartsnameversionLabelsPost) | **POST** /chartrepo/:repo/charts/:name/:version/labels | Mark label to chart.
[**chartreporepoChartsnameversionLabelsidDelete**](LabelApi.md#chartreporepoChartsnameversionLabelsidDelete) | **DELETE** /chartrepo/:repo/charts/:name/:version/labels/:id | Remove label from chart.

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
//import com.imwyh.harbor.client.api.LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LabelApi apiInstance = new LabelApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartreporepoChartsnameversionLabelsGet(repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelApi#chartreporepoChartsnameversionLabelsGet");
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
//import com.imwyh.harbor.client.api.LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LabelApi apiInstance = new LabelApi();
Label body = new Label(); // Label | The label being marked to the chart version
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartreporepoChartsnameversionLabelsPost(body, repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelApi#chartreporepoChartsnameversionLabelsPost");
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
//import com.imwyh.harbor.client.api.LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LabelApi apiInstance = new LabelApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
Integer id = 56; // Integer | The label ID
try {
    apiInstance.chartreporepoChartsnameversionLabelsidDelete(repo, name, version, id);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelApi#chartreporepoChartsnameversionLabelsidDelete");
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

