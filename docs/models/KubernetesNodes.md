

# KubernetesNodes

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A unique representation of the Kubernetes node pool as a resource collection. |  [optional] [readonly] |
| **type** | [**TypeEnum**](#TypeEnum) | The type of resource within a collection. |  [optional] [readonly] |
| **href** | [**URI**](URI.md) | URL to the collection representation (absolute path). |  [optional] [readonly] |
| **items** | [**List&lt;KubernetesNode&gt;**](KubernetesNode.md) | Array of items in the collection. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
| ---- | -----
| COLLECTION | &quot;collection&quot; |

