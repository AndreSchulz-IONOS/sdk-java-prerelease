/*
 * CLOUD API
 * An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.   The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.
 *
 * The version of the OpenAPI document: 6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.api;

import com.ionoscloud.ApiException;
import com.ionoscloud.model.Error;
import com.ionoscloud.model.KubernetesCluster;
import com.ionoscloud.model.KubernetesClusterForPost;
import com.ionoscloud.model.KubernetesClusterForPut;
import com.ionoscloud.model.KubernetesClusters;
import com.ionoscloud.model.KubernetesNode;
import com.ionoscloud.model.KubernetesNodePool;
import com.ionoscloud.model.KubernetesNodePoolForPut;
import com.ionoscloud.model.KubernetesNodePools;
import com.ionoscloud.model.KubernetesNodes;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KubernetesApi
 */
@Ignore
public class KubernetesApiTest {

    private final KubernetesApi api = new KubernetesApi();

    
    /**
     * Delete Kubernetes Cluster
     *
     * This will remove a Kubernetes Cluster.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sDeleteTest() throws ApiException {
        String k8sClusterId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Object response = api.k8sDelete(k8sClusterId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve Kubernetes Cluster
     *
     * This will retrieve a single Kubernetes Cluster.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sFindByClusterIdTest() throws ApiException {
        String k8sClusterId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        KubernetesCluster response = api.k8sFindByClusterId(k8sClusterId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * List Kubernetes Clusters
     *
     * You can retrieve a list of all kubernetes clusters associated with a contract
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sGetTest() throws ApiException {
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        KubernetesClusters response = api.k8sGet(pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve Kubernetes Configuration File
     *
     * You can retrieve kubernetes configuration file in YAML or JSON format for the kubernetes cluster. You can send the Accept header accordingly. Default Accept header is application/yaml
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sKubeconfigGetTest() throws ApiException {
        String k8sClusterId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        String response = api.k8sKubeconfigGet(k8sClusterId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Delete Kubernetes Node Pool
     *
     * This will remove a Kubernetes Node Pool.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sNodepoolsDeleteTest() throws ApiException {
        String k8sClusterId = null;
        String nodepoolId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Object response = api.k8sNodepoolsDelete(k8sClusterId, nodepoolId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve Kubernetes Node Pool
     *
     * You can retrieve a single Kubernetes Node Pool.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sNodepoolsFindByIdTest() throws ApiException {
        String k8sClusterId = null;
        String nodepoolId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        KubernetesNodePool response = api.k8sNodepoolsFindById(k8sClusterId, nodepoolId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * List Kubernetes Node Pools
     *
     * You can retrieve a list of all kubernetes node pools part of kubernetes cluster
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sNodepoolsGetTest() throws ApiException {
        String k8sClusterId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        KubernetesNodePools response = api.k8sNodepoolsGet(k8sClusterId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Delete Kubernetes node
     *
     * This will remove a Kubernetes node.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sNodepoolsNodesDeleteTest() throws ApiException {
        String k8sClusterId = null;
        String nodepoolId = null;
        String nodeId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Object response = api.k8sNodepoolsNodesDelete(k8sClusterId, nodepoolId, nodeId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve Kubernetes node
     *
     * You can retrieve a single Kubernetes Node.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sNodepoolsNodesFindByIdTest() throws ApiException {
        String k8sClusterId = null;
        String nodepoolId = null;
        String nodeId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        KubernetesNode response = api.k8sNodepoolsNodesFindById(k8sClusterId, nodepoolId, nodeId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve Kubernetes nodes.
     *
     * You can retrieve all nodes of Kubernetes Node Pool.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sNodepoolsNodesGetTest() throws ApiException {
        String k8sClusterId = null;
        String nodepoolId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        KubernetesNodes response = api.k8sNodepoolsNodesGet(k8sClusterId, nodepoolId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Recreate the Kubernetes node
     *
     * You can recreate a single Kubernetes Node.  Managed Kubernetes starts a process which based on the nodepool&#39;s template creates &amp; configures a new node, waits for status \&quot;ACTIVE\&quot;, and migrates all the pods from the faulty node, deleting it once empty. While this operation occurs, the nodepool will have an extra billable \&quot;ACTIVE\&quot; node.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sNodepoolsNodesReplacePostTest() throws ApiException {
        String k8sClusterId = null;
        String nodepoolId = null;
        String nodeId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Object response = api.k8sNodepoolsNodesReplacePost(k8sClusterId, nodepoolId, nodeId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Create a Kubernetes Node Pool
     *
     * This will create a new Kubernetes Node Pool inside a Kubernetes Cluster.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sNodepoolsPostTest() throws ApiException {
        String k8sClusterId = null;
        KubernetesNodePool kubernetesNodePool = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        KubernetesNodePool response = api.k8sNodepoolsPost(k8sClusterId, kubernetesNodePool, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Modify Kubernetes Node Pool
     *
     * This will modify the Kubernetes Node Pool.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sNodepoolsPutTest() throws ApiException {
        String k8sClusterId = null;
        String nodepoolId = null;
        KubernetesNodePool kubernetesNodePool = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        KubernetesNodePoolForPut response = api.k8sNodepoolsPut(k8sClusterId, nodepoolId, kubernetesNodePool, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Create Kubernetes Cluster
     *
     * This will create a new Kubernetes Cluster.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sPostTest() throws ApiException {
        KubernetesClusterForPost kubernetesCluster = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        KubernetesCluster response = api.k8sPost(kubernetesCluster, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Modify Kubernetes Cluster
     *
     * This will modify the Kubernetes Cluster.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sPutTest() throws ApiException {
        String k8sClusterId = null;
        KubernetesClusterForPut kubernetesCluster = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        KubernetesCluster response = api.k8sPut(k8sClusterId, kubernetesCluster, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve the current default kubernetes version for clusters and nodepools.
     *
     * You can retrieve the current default kubernetes version for clusters and nodepools.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sVersionsDefaultGetTest() throws ApiException {
        String response = api.k8sVersionsDefaultGet();

        // TODO: test validations
    }
    
    /**
     * Retrieve available Kubernetes versions
     *
     * You can retrieve a list of available kubernetes versions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k8sVersionsGetTest() throws ApiException {
        List<String> response = api.k8sVersionsGet();

        // TODO: test validations
    }
    
}
