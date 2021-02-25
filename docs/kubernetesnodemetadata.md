# KubernetesNodeMetadata

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **etag** | **String** | Resource's Entity Tag as defined in [http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html\#sec3.11](http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11) . Entity Tag is also added as an 'ETag response header to requests which don't use 'depth' parameter. | \[optional\] \[readonly\] |
| **createdDate** | [**OffsetDateTime**](https://github.com/ionos-cloud/sdk-java/tree/e301a24b681f0ad424762e13995b95c67ad7e66b/docs/OffsetDateTime.md) | The last time the resource was created | \[optional\] \[readonly\] |
| **lastModifiedDate** | [**OffsetDateTime**](https://github.com/ionos-cloud/sdk-java/tree/e301a24b681f0ad424762e13995b95c67ad7e66b/docs/OffsetDateTime.md) | The last time the resource has been modified | \[optional\] \[readonly\] |
| **state** | [**StateEnum**](kubernetesnodemetadata.md#StateEnum) | State of the resource. | \[optional\] \[readonly\] |
| **lastSoftwareUpdatedDate** | [**OffsetDateTime**](https://github.com/ionos-cloud/sdk-java/tree/e301a24b681f0ad424762e13995b95c67ad7e66b/docs/OffsetDateTime.md) | The last time the software updated on node. | \[optional\] \[readonly\] |

## Enum: StateEnum

| Name | Value |
| :--- | :--- |
| PROVISIONING | "PROVISIONING" |
| PROVISIONED | "PROVISIONED" |
| READY | "READY" |
| TERMINATING | "TERMINATING" |
| REBUILDING | "REBUILDING" |
| BUSY | "BUSY" |
| UNKNOWN | "UNKNOWN" |
