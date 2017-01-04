/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurereport.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.azurereport.AutoRestReportServiceForAzure;
import fixtures.azurereport.models.ErrorException;
import java.io.IOException;
import java.util.Map;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the AutoRestReportServiceForAzureImpl class.
 */
public final class AutoRestReportServiceForAzureImpl extends AzureServiceClient implements AutoRestReportServiceForAzure {
    /** The Retrofit service to perform REST calls. */
    private AutoRestReportServiceForAzureService service;
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
    public AutoRestReportServiceForAzureImpl withAcceptLanguage(String acceptLanguage) {
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
    public AutoRestReportServiceForAzureImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public AutoRestReportServiceForAzureImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * Initializes an instance of AutoRestReportServiceForAzure client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestReportServiceForAzureImpl(ServiceClientCredentials credentials) {
        this("http://localhost", credentials);
    }

    /**
     * Initializes an instance of AutoRestReportServiceForAzure client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestReportServiceForAzureImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestReportServiceForAzure client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public AutoRestReportServiceForAzureImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.azureClient = new AzureClient(this);
        initializeService();
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
                "AutoRestReportServiceForAzure, 1.0.0");
    }

    private void initializeService() {
        service = restClient().retrofit().create(AutoRestReportServiceForAzureService.class);
    }

    /**
     * The interface defining all the services for AutoRestReportServiceForAzure to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AutoRestReportServiceForAzureService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("report/azure")
        Observable<Response<ResponseBody>> getReport(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get test coverage report.
     *
     * @return the Map&lt;String, Integer&gt; object if successful.
     */
    public Map<String, Integer> getReport() {
        return getReportWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get test coverage report.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Map<String, Integer>> getReportAsync(final ServiceCallback<Map<String, Integer>> serviceCallback) {
        return ServiceCall.fromResponse(getReportWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get test coverage report.
     *
     * @return the observable to the Map&lt;String, Integer&gt; object
     */
    public Observable<Map<String, Integer>> getReportAsync() {
        return getReportWithServiceResponseAsync().map(new Func1<ServiceResponse<Map<String, Integer>>, Map<String, Integer>>() {
            @Override
            public Map<String, Integer> call(ServiceResponse<Map<String, Integer>> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get test coverage report.
     *
     * @return the observable to the Map&lt;String, Integer&gt; object
     */
    public Observable<ServiceResponse<Map<String, Integer>>> getReportWithServiceResponseAsync() {
        return service.getReport(this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Map<String, Integer>>>>() {
                @Override
                public Observable<ServiceResponse<Map<String, Integer>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Map<String, Integer>> clientResponse = getReportDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Map<String, Integer>> getReportDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.restClient().responseBuilderFactory().<Map<String, Integer>, ErrorException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Map<String, Integer>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
