# GCScheduleSchedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The schedule type. The valid values are daily， weekly and None. &#x27;None&#x27; means to cancel the schedule. |  [optional]
**weekday** | **Integer** | Optional, only used when the type is weekly. The valid values are 1-7. |  [optional]
**offtime** | **Long** | The time offset with the UTC 00:00 in seconds. |  [optional]
