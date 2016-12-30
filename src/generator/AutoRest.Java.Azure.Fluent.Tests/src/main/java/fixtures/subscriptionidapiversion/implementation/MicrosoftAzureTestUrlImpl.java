/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.subscriptionidapiversion.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the MicrosoftAzureTestUrlImpl class.
 */
public final class MicrosoftAzureTestUrlImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Subscription Id. */
    private String subscriptionId;

    /**
     * Gets Subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription Id.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public MicrosoftAzureTestUrlImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** API Version with value '2014-04-01-preview'. */
    private String apiVersion;

    /**
     * Gets API Version with value '2014-04-01-preview'.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
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
    public MicrosoftAzureTestUrlImpl withAcceptLanguage(String acceptLanguage) {
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
    public MicrosoftAzureTestUrlImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public MicrosoftAzureTestUrlImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The GroupsInner object to access its operations.
     */
    private GroupsInner groups;

    /**
     * Gets the GroupsInner object to access its operations.
     * @return the GroupsInner object.
     */
    public GroupsInner groups() {
        return this.groups;
    }

    /**
     * Initializes an instance of MicrosoftAzureTestUrl client.
     *
     * @param credentials the management credentials for Azure
     */
    public MicrosoftAzureTestUrlImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com/", credentials);
    }

    /**
     * Initializes an instance of MicrosoftAzureTestUrl client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public MicrosoftAzureTestUrlImpl(String baseUrl, ServiceClientCredentials credentials) {
        this(new RestClient.Builder()
                .withBaseUrl(baseUrl)
                .withCredentials(credentials)
                .build());
    }

    /**
     * Initializes an instance of MicrosoftAzureTestUrl client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public MicrosoftAzureTestUrlImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2014-04-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.groups = new GroupsInner(restClient().retrofit(), this);
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
                "MicrosoftAzureTestUrl, 2014-04-01-preview");
    }
}
