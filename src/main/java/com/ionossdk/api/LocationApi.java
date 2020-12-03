/*
 * CLOUD API
 * An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.   The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.
 *
 * The version of the OpenAPI document: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionossdk.api;

import com.ionossdk.ApiCallback;
import com.ionossdk.ApiClient;
import com.ionossdk.ApiException;
import com.ionossdk.ApiResponse;
import com.ionossdk.Configuration;
import com.ionossdk.Pair;
import com.ionossdk.ProgressRequestBody;
import com.ionossdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ionossdk.model.Error;
import com.ionossdk.model.Location;
import com.ionossdk.model.Locations;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocationApi {
    private ApiClient localVarApiClient;

    public LocationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LocationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for locationsFindByRegionId
     * @param regionId  (required)
     * @param pretty Controls whether response is pretty-printed (with indentation and new lines) (optional, default to true)
     * @param depth Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users having more than 1 contract need to provide contract number, against which all API requests should be executed (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Remaining - Number of requests which can still be made without triggering a failure response.  <br>  * X-RateLimit-Limit - Average number of requests allowed per minute <br>  * X-RateLimit-Burst - Maximum number of concurrent API requests allowed <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance) </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call locationsFindByRegionIdCall(String regionId, Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/locations/{regionId}"
            .replaceAll("\\{" + "regionId" + "\\}", localVarApiClient.escapeString(regionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (depth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("depth", depth));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xContractNumber != null) {
            localVarHeaderParams.put("X-Contract-Number", localVarApiClient.parameterToString(xContractNumber));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic Authentication", "Token Authentication" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call locationsFindByRegionIdValidateBeforeCall(String regionId, Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new ApiException("Missing the required parameter 'regionId' when calling locationsFindByRegionId(Async)");
        }
        

        okhttp3.Call localVarCall = locationsFindByRegionIdCall(regionId, pretty, depth, xContractNumber, _callback);
        return localVarCall;

    }

    /**
     * List Locations within a region
     * Retrieve a list of Locations within a world&#39;s region
     * @param regionId  (required)
     * @param pretty Controls whether response is pretty-printed (with indentation and new lines) (optional, default to true)
     * @param depth Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users having more than 1 contract need to provide contract number, against which all API requests should be executed (optional)
     * @return Locations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Remaining - Number of requests which can still be made without triggering a failure response.  <br>  * X-RateLimit-Limit - Average number of requests allowed per minute <br>  * X-RateLimit-Burst - Maximum number of concurrent API requests allowed <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance) </td><td>  -  </td></tr>
     </table>
     */
    public Locations locationsFindByRegionId(String regionId, Boolean pretty, Integer depth, Integer xContractNumber) throws ApiException {
        ApiResponse<Locations> localVarResp = locationsFindByRegionIdWithHttpInfo(regionId, pretty, depth, xContractNumber);
        return localVarResp.getData();
    }

    /**
     * List Locations within a region
     * Retrieve a list of Locations within a world&#39;s region
     * @param regionId  (required)
     * @param pretty Controls whether response is pretty-printed (with indentation and new lines) (optional, default to true)
     * @param depth Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users having more than 1 contract need to provide contract number, against which all API requests should be executed (optional)
     * @return ApiResponse&lt;Locations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Remaining - Number of requests which can still be made without triggering a failure response.  <br>  * X-RateLimit-Limit - Average number of requests allowed per minute <br>  * X-RateLimit-Burst - Maximum number of concurrent API requests allowed <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance) </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Locations> locationsFindByRegionIdWithHttpInfo(String regionId, Boolean pretty, Integer depth, Integer xContractNumber) throws ApiException {
        okhttp3.Call localVarCall = locationsFindByRegionIdValidateBeforeCall(regionId, pretty, depth, xContractNumber, null);
        Type localVarReturnType = new TypeToken<Locations>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Locations within a region (asynchronously)
     * Retrieve a list of Locations within a world&#39;s region
     * @param regionId  (required)
     * @param pretty Controls whether response is pretty-printed (with indentation and new lines) (optional, default to true)
     * @param depth Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users having more than 1 contract need to provide contract number, against which all API requests should be executed (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Remaining - Number of requests which can still be made without triggering a failure response.  <br>  * X-RateLimit-Limit - Average number of requests allowed per minute <br>  * X-RateLimit-Burst - Maximum number of concurrent API requests allowed <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance) </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call locationsFindByRegionIdAsync(String regionId, Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback<Locations> _callback) throws ApiException {

        okhttp3.Call localVarCall = locationsFindByRegionIdValidateBeforeCall(regionId, pretty, depth, xContractNumber, _callback);
        Type localVarReturnType = new TypeToken<Locations>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for locationsFindByRegionIdAndId
     * @param regionId  (required)
     * @param locationId  (required)
     * @param pretty Controls whether response is pretty-printed (with indentation and new lines) (optional, default to true)
     * @param depth Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users having more than 1 contract need to provide contract number, against which all API requests should be executed (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Remaining - Number of requests which can still be made without triggering a failure response.  <br>  * X-RateLimit-Limit - Average number of requests allowed per minute <br>  * X-RateLimit-Burst - Maximum number of concurrent API requests allowed <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance) </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call locationsFindByRegionIdAndIdCall(String regionId, String locationId, Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/locations/{regionId}/{locationId}"
            .replaceAll("\\{" + "regionId" + "\\}", localVarApiClient.escapeString(regionId.toString()))
            .replaceAll("\\{" + "locationId" + "\\}", localVarApiClient.escapeString(locationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (depth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("depth", depth));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xContractNumber != null) {
            localVarHeaderParams.put("X-Contract-Number", localVarApiClient.parameterToString(xContractNumber));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic Authentication", "Token Authentication" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call locationsFindByRegionIdAndIdValidateBeforeCall(String regionId, String locationId, Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new ApiException("Missing the required parameter 'regionId' when calling locationsFindByRegionIdAndId(Async)");
        }
        
        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new ApiException("Missing the required parameter 'locationId' when calling locationsFindByRegionIdAndId(Async)");
        }
        

        okhttp3.Call localVarCall = locationsFindByRegionIdAndIdCall(regionId, locationId, pretty, depth, xContractNumber, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a Location
     * Retrieves the attributes of a given location
     * @param regionId  (required)
     * @param locationId  (required)
     * @param pretty Controls whether response is pretty-printed (with indentation and new lines) (optional, default to true)
     * @param depth Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users having more than 1 contract need to provide contract number, against which all API requests should be executed (optional)
     * @return Location
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Remaining - Number of requests which can still be made without triggering a failure response.  <br>  * X-RateLimit-Limit - Average number of requests allowed per minute <br>  * X-RateLimit-Burst - Maximum number of concurrent API requests allowed <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance) </td><td>  -  </td></tr>
     </table>
     */
    public Location locationsFindByRegionIdAndId(String regionId, String locationId, Boolean pretty, Integer depth, Integer xContractNumber) throws ApiException {
        ApiResponse<Location> localVarResp = locationsFindByRegionIdAndIdWithHttpInfo(regionId, locationId, pretty, depth, xContractNumber);
        return localVarResp.getData();
    }

    /**
     * Retrieve a Location
     * Retrieves the attributes of a given location
     * @param regionId  (required)
     * @param locationId  (required)
     * @param pretty Controls whether response is pretty-printed (with indentation and new lines) (optional, default to true)
     * @param depth Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users having more than 1 contract need to provide contract number, against which all API requests should be executed (optional)
     * @return ApiResponse&lt;Location&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Remaining - Number of requests which can still be made without triggering a failure response.  <br>  * X-RateLimit-Limit - Average number of requests allowed per minute <br>  * X-RateLimit-Burst - Maximum number of concurrent API requests allowed <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance) </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Location> locationsFindByRegionIdAndIdWithHttpInfo(String regionId, String locationId, Boolean pretty, Integer depth, Integer xContractNumber) throws ApiException {
        okhttp3.Call localVarCall = locationsFindByRegionIdAndIdValidateBeforeCall(regionId, locationId, pretty, depth, xContractNumber, null);
        Type localVarReturnType = new TypeToken<Location>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a Location (asynchronously)
     * Retrieves the attributes of a given location
     * @param regionId  (required)
     * @param locationId  (required)
     * @param pretty Controls whether response is pretty-printed (with indentation and new lines) (optional, default to true)
     * @param depth Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users having more than 1 contract need to provide contract number, against which all API requests should be executed (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Remaining - Number of requests which can still be made without triggering a failure response.  <br>  * X-RateLimit-Limit - Average number of requests allowed per minute <br>  * X-RateLimit-Burst - Maximum number of concurrent API requests allowed <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance) </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call locationsFindByRegionIdAndIdAsync(String regionId, String locationId, Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback<Location> _callback) throws ApiException {

        okhttp3.Call localVarCall = locationsFindByRegionIdAndIdValidateBeforeCall(regionId, locationId, pretty, depth, xContractNumber, _callback);
        Type localVarReturnType = new TypeToken<Location>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for locationsGet
     * @param pretty Controls whether response is pretty-printed (with indentation and new lines) (optional, default to true)
     * @param depth Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users having more than 1 contract need to provide contract number, against which all API requests should be executed (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Remaining - Number of requests which can still be made without triggering a failure response.  <br>  * X-RateLimit-Limit - Average number of requests allowed per minute <br>  * X-RateLimit-Burst - Maximum number of concurrent API requests allowed <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance) </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call locationsGetCall(Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/locations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (depth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("depth", depth));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xContractNumber != null) {
            localVarHeaderParams.put("X-Contract-Number", localVarApiClient.parameterToString(xContractNumber));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic Authentication", "Token Authentication" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call locationsGetValidateBeforeCall(Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = locationsGetCall(pretty, depth, xContractNumber, _callback);
        return localVarCall;

    }

    /**
     * List Locations
     * Retrieve a list of Locations. This list represents where you can provision your virtual data centers
     * @param pretty Controls whether response is pretty-printed (with indentation and new lines) (optional, default to true)
     * @param depth Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users having more than 1 contract need to provide contract number, against which all API requests should be executed (optional)
     * @return Locations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Remaining - Number of requests which can still be made without triggering a failure response.  <br>  * X-RateLimit-Limit - Average number of requests allowed per minute <br>  * X-RateLimit-Burst - Maximum number of concurrent API requests allowed <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance) </td><td>  -  </td></tr>
     </table>
     */
    public Locations locationsGet(Boolean pretty, Integer depth, Integer xContractNumber) throws ApiException {
        ApiResponse<Locations> localVarResp = locationsGetWithHttpInfo(pretty, depth, xContractNumber);
        return localVarResp.getData();
    }

    /**
     * List Locations
     * Retrieve a list of Locations. This list represents where you can provision your virtual data centers
     * @param pretty Controls whether response is pretty-printed (with indentation and new lines) (optional, default to true)
     * @param depth Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users having more than 1 contract need to provide contract number, against which all API requests should be executed (optional)
     * @return ApiResponse&lt;Locations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Remaining - Number of requests which can still be made without triggering a failure response.  <br>  * X-RateLimit-Limit - Average number of requests allowed per minute <br>  * X-RateLimit-Burst - Maximum number of concurrent API requests allowed <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance) </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Locations> locationsGetWithHttpInfo(Boolean pretty, Integer depth, Integer xContractNumber) throws ApiException {
        okhttp3.Call localVarCall = locationsGetValidateBeforeCall(pretty, depth, xContractNumber, null);
        Type localVarReturnType = new TypeToken<Locations>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Locations (asynchronously)
     * Retrieve a list of Locations. This list represents where you can provision your virtual data centers
     * @param pretty Controls whether response is pretty-printed (with indentation and new lines) (optional, default to true)
     * @param depth Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users having more than 1 contract need to provide contract number, against which all API requests should be executed (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Remaining - Number of requests which can still be made without triggering a failure response.  <br>  * X-RateLimit-Limit - Average number of requests allowed per minute <br>  * X-RateLimit-Burst - Maximum number of concurrent API requests allowed <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance) </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call locationsGetAsync(Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback<Locations> _callback) throws ApiException {

        okhttp3.Call localVarCall = locationsGetValidateBeforeCall(pretty, depth, xContractNumber, _callback);
        Type localVarReturnType = new TypeToken<Locations>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
