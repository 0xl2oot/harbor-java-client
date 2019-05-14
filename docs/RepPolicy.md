# RepPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The policy ID. |  [optional]
**name** | **String** | The policy name. |  [optional]
**description** | **String** | The description of the policy. |  [optional]
**projects** | [**List&lt;Project&gt;**](Project.md) | The project list that the policy applys to. |  [optional]
**targets** | [**List&lt;RepTarget&gt;**](RepTarget.md) | The target list. |  [optional]
**trigger** | [**RepTrigger**](RepTrigger.md) |  |  [optional]
**filters** | [**List&lt;RepFilter&gt;**](RepFilter.md) | The replication policy filter array. |  [optional]
**replicateExistingImageNow** | **Boolean** | Whether to replicate the existing images now. |  [optional]
**replicateDeletion** | **Boolean** | Whether to replicate the deletion operation. |  [optional]
**creationTime** | **String** | The create time of the policy. |  [optional]
**updateTime** | **String** | The update time of the policy. |  [optional]
**errorJobCount** | **Integer** | The error job count number for the policy. |  [optional]
