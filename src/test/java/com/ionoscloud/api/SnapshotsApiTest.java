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
import com.ionoscloud.model.Snapshot;
import com.ionoscloud.model.SnapshotProperties;
import com.ionoscloud.model.Snapshots;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SnapshotsApi
 */
@Ignore
public class SnapshotsApiTest {

    private final SnapshotsApi api = new SnapshotsApi();

    
    /**
     * Delete a Snapshot
     *
     * Deletes the specified snapshot.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void snapshotsDeleteTest() throws ApiException {
        String snapshotId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Object response = api.snapshotsDelete(snapshotId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Snapshot by its uuid.
     *
     * Retrieves the attributes of a given Snapshot.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void snapshotsFindByIdTest() throws ApiException {
        String snapshotId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Snapshot response = api.snapshotsFindById(snapshotId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * List Snapshots
     *
     * Retrieve a list of available snapshots.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void snapshotsGetTest() throws ApiException {
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Snapshots response = api.snapshotsGet(pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Partially modify a Snapshot
     *
     * You can use this method to update attributes of a snapshot.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void snapshotsPatchTest() throws ApiException {
        String snapshotId = null;
        SnapshotProperties snapshot = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Snapshot response = api.snapshotsPatch(snapshotId, snapshot, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Modify a Snapshot
     *
     * You can use update attributes of a resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void snapshotsPutTest() throws ApiException {
        String snapshotId = null;
        Snapshot snapshot = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Snapshot response = api.snapshotsPut(snapshotId, snapshot, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
}
