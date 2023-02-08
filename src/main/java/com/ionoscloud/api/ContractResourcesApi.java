/*
 * CLOUD API
 * IONOS Enterprise-grade Infrastructure as a Service (IaaS) solutions can be managed through the Cloud API, in addition or as an alternative to the \"Data Center Designer\" (DCD) browser-based tool.    Both methods employ consistent concepts and features, deliver similar power and flexibility, and can be used to perform a multitude of management tasks, including adding servers, volumes, configuring networks, and so on.
 *
 * The version of the OpenAPI document: 6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.api;

import com.ionoscloud.ApiCallback;
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.Pair;
import com.ionoscloud.ProgressRequestBody;
import com.ionoscloud.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ionoscloud.model.Contracts;
import com.ionoscloud.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractResourcesApi {
    private ApiClient localVarApiClient;

    public ContractResourcesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContractResourcesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for contractsGet
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
     * @param callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call contractsGetCall(Boolean pretty, Integer depth, Integer xContractNumber,  String orderBy, Integer maxResults, Map<String, String> filters,final ApiCallback callback ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/contracts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }
        if (depth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("depth", depth));
        }
        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderBy", orderBy));
        }
        if (maxResults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxResults", maxResults));
        }
        if (filters != null) {
            filters.forEach((key, value) -> {
                localVarQueryParams.add(new Pair(String.format("filter.%s", key), value));
            });
        }

        if (xContractNumber != null) {
            localVarHeaderParams.put("X-Contract-Number", localVarApiClient.parameterToString(xContractNumber));
        }

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
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call contractsGetValidateBeforeCall(Boolean pretty, Integer depth, Integer xContractNumber,  String orderBy, Integer maxResults , Map<String, String> filters,final ApiCallback callback) throws ApiException {
        

        okhttp3.Call localVarCall = contractsGetCall(pretty, depth, xContractNumber,  orderBy, maxResults, filters,callback);
        return localVarCall;

    }

    /**
     * Retrieve contracts
     * Retrieve the properties of the user&#39;s contract. In this version, the resource became a collection.
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
     * @param orderBy - Sorts the results alphanumerically in ascending order based on the specified property.
     * @param maxResults - Limits the number of results returned.
     * @param filters - Filters query parameters limit results to those containing a matching value for a specific property.
     * @return Contracts
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public Contracts contractsGet(Boolean pretty, Integer depth, Integer xContractNumber,  String orderBy, Integer maxResults, Map<String, String> filters) throws ApiException {
        ApiResponse<Contracts> localVarResp = contractsGetWithHttpInfo(pretty, depth, xContractNumber, orderBy, maxResults, filters);
        return localVarResp.getData();
    }

    /**
     * Retrieve contracts
     * Retrieve the properties of the user&#39;s contract. In this version, the resource became a collection.
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
     * @param orderBy - Sorts the results alphanumerically in ascending order based on the specified property.
     * @param maxResults - Limits the number of results returned.
     * @param filters - Filters query parameters limit results to those containing a matching value for a specific property.
     * @return ApiResponse&lt;Contracts&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Contracts> contractsGetWithHttpInfo(Boolean pretty, Integer depth, Integer xContractNumber, String orderBy, Integer maxResults, Map<String, String> filters) throws ApiException {
        okhttp3.Call localVarCall = contractsGetValidateBeforeCall(pretty, depth, xContractNumber,  orderBy, maxResults, filters, null);
        Type localVarReturnType = new TypeToken<Contracts>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve contracts (asynchronously)
     * Retrieve the properties of the user&#39;s contract. In this version, the resource became a collection.
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call contractsGetAsync(Boolean pretty, Integer depth, Integer xContractNumber, String orderBy, Integer maxResults, Map<String, String> filters,final ApiCallback<Contracts> callback) throws ApiException {

        okhttp3.Call localVarCall = contractsGetValidateBeforeCall(pretty, depth, xContractNumber,  orderBy, maxResults, filters, callback);
        Type localVarReturnType = new TypeToken<Contracts>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, callback);
        return localVarCall;
    }

    public class APIcontractsGetRequest {
        private Boolean pretty;
        private Integer depth;
        private Integer xContractNumber;
        private String orderBy;
        private Integer maxResults;
        private Map<String, String> filters;

        private APIcontractsGetRequest() {
        }

        /**
         * Set pretty
         * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
         * @return APIcontractsGetRequest
         */
        public APIcontractsGetRequest pretty(Boolean pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set depth
         * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
         * @return APIcontractsGetRequest
         */
        public APIcontractsGetRequest depth(Integer depth) {
            this.depth = depth;
            return this;
        }

        /**
         * Set xContractNumber
         * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
         * @return APIcontractsGetRequest
         */
        public APIcontractsGetRequest xContractNumber(Integer xContractNumber) {
            this.xContractNumber = xContractNumber;
            return this;
        }


        /**
        * Set orderBy
        * @param orderBy Orders the response based on a property.
        * @return APIcontractsGetRequest
        */
        public APIcontractsGetRequest orderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        /**
        * Set maxResults
        * @param maxResults Limits the number of items in a response.
        * @return APIcontractsGetRequest
        */
        public APIcontractsGetRequest maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
        * Set filters
        * @param filters Filters the response based on a property.
        * @return APIcontractsGetRequest
        */
        public APIcontractsGetRequest filters(Map<String, String> filters) {
            this.filters = filters;
            return this;
        }


        /**
         * Build call for contractsGet
         * @param callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
            <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback callback) throws ApiException {
            return contractsGetCall(pretty, depth, xContractNumber, orderBy, maxResults, filters, callback);
        }

        /**
         * Execute contractsGet request
         * @return Contracts
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
            <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
         </table>
         */
        public Contracts execute() throws ApiException {
        ApiResponse<Contracts> localVarResp = contractsGetWithHttpInfo(pretty, depth, xContractNumber, orderBy, maxResults, filters);
            return localVarResp.getData();
        }

        /**
         * Execute contractsGet request with HTTP info returned
         * @return ApiResponse&lt;Contracts&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
            <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Contracts> executeWithHttpInfo() throws ApiException {
            return contractsGetWithHttpInfo(pretty, depth, xContractNumber, orderBy, maxResults, filters);
        }

        /**
         * Execute contractsGet request (asynchronously)
         * @param callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
            <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Contracts> callback) throws ApiException {
            return contractsGetAsync(pretty, depth, xContractNumber, orderBy, maxResults, filters, callback);
        }
    }

    /**
     * Retrieve contracts
     * Retrieve the properties of the user&#39;s contract. In this version, the resource became a collection.
     * @return APIcontractsGetRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public APIcontractsGetRequest contractsGet() {
        return new APIcontractsGetRequest();
    }
}
