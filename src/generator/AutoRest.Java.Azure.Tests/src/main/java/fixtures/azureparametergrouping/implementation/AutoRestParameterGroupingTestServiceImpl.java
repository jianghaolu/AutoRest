/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.RestClient;
import fixtures.azureparametergrouping.AutoRestParameterGroupingTestService;
import fixtures.azureparametergrouping.ParameterGroupings;

/**
 * Initializes a new instance of the AutoRestParameterGroupingTestServiceImpl class.
 */
public final class AutoRestParameterGroupingTestServiceImpl extends AzureServiceClient implements AutoRestParameterGroupingTestService {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AutoRestParameterGroupingTestServiceImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AutoRestParameterGroupingTestServiceImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AutoRestParameterGroupingTestServiceImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ParameterGroupings object to access its operations.
     */
    private ParameterGroupings parameterGroupings;

    /**
     * Gets the ParameterGroupings object to access its operations.
     * @return the ParameterGroupings object.
     */
    public ParameterGroupings parameterGroupings() {
        return this.parameterGroupings;
    }

    /**
     * Initializes an instance of AutoRestParameterGroupingTestService client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestParameterGroupingTestServiceImpl(ServiceClientCredentials credentials) {
        this("https://localhost", credentials);
    }

    /**
     * Initializes an instance of AutoRestParameterGroupingTestService client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestParameterGroupingTestServiceImpl(String baseUrl, ServiceClientCredentials credentials) {
        this(new RestClient.Builder()
                .withBaseUrl(baseUrl)
                .withCredentials(credentials)
                .build());
    }

    /**
     * Initializes an instance of AutoRestParameterGroupingTestService client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public AutoRestParameterGroupingTestServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.parameterGroupings = new ParameterGroupingsImpl(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("Azure-SDK-For-Java/%s (%s)",
                getClass().getPackage().getImplementationVersion(),
                "AutoRestParameterGroupingTestService, 1.0.0");
    }
}
