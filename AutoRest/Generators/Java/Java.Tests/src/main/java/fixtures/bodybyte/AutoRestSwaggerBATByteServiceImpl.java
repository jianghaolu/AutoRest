// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodybyte;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhtpp.OkHttpClient;
import retrofit.RestAdapter;

/**
 * Initializes a new instance of the AutoRestSwaggerBATByteService class.
 */
public class AutoRestSwaggerBATByteServiceImpl extends ServiceClient<AutoRestSwaggerBATByteService> implements AutoRestSwaggerBATByteService {
    private String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri();

    private ByteOperations byteOperations;

    /**
     * Test Infrastructure for AutoRest Swagger BAT
     * @return the byteOperations value.
     */
    ByteOperations getByteOperations();

    public AutoRestSwaggerBATByteService() {
        this("http://localhost");
    }

    public AutoRestSwaggerBATByteService(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    public AutoRestSwaggerBATByteService(String baseUri, OkHttpClient client, RestAdapter.Builder restAdapterBuilder) {
        super(client, restAdapterBuilder);
        this.baseUri = baseUri();
        initialize();
    }

    private void initialize() {
        RestAdapter restAdapter = restAdapterBuilder.setEndpoint(baseUri).build();
        this.byteOperations = restAdapter.create(ByteOperations.class);
    }
}