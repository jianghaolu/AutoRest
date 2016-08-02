/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro;

import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
import fixtures.lro.models.LRORetrysDelete202Retry200Headers;
import fixtures.lro.models.LRORetrysDeleteAsyncRelativeRetrySucceededHeaders;
import fixtures.lro.models.LRORetrysDeleteProvisioning202Accepted200SucceededHeaders;
import fixtures.lro.models.LRORetrysPost202Retry200Headers;
import fixtures.lro.models.LRORetrysPostAsyncRelativeRetrySucceededHeaders;
import fixtures.lro.models.LRORetrysPutAsyncRelativeRetrySucceededHeaders;
import fixtures.lro.models.Product;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in LRORetrys.
 */
public interface LRORetrys {
    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Product> put201CreatingSucceeded200() throws CloudException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Product>> put201CreatingSucceeded200Async(final ServiceCallback<Product> serviceCallback) throws IllegalArgumentException;
    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Product> put201CreatingSucceeded200(Product product) throws CloudException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Product>> put201CreatingSucceeded200Async(Product product, final ServiceCallback<Product> serviceCallback) throws IllegalArgumentException;

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Product object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Product> beginPut201CreatingSucceeded200() throws CloudException, IOException;

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Product>> beginPut201CreatingSucceeded200Async(final ServiceCallback<Product> serviceCallback) throws IllegalArgumentException;
    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Product object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Product> beginPut201CreatingSucceeded200(Product product) throws CloudException, IOException;

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Product>> beginPut201CreatingSucceeded200Async(Product product, final ServiceCallback<Product> serviceCallback) throws IllegalArgumentException;

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    ServiceResponseWithHeaders<Product, LRORetrysPutAsyncRelativeRetrySucceededHeaders> putAsyncRelativeRetrySucceeded() throws CloudException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Product, LRORetrysPutAsyncRelativeRetrySucceededHeaders>> putAsyncRelativeRetrySucceededAsync(final ServiceCallback<Product> serviceCallback) throws IllegalArgumentException;
    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    ServiceResponseWithHeaders<Product, LRORetrysPutAsyncRelativeRetrySucceededHeaders> putAsyncRelativeRetrySucceeded(Product product) throws CloudException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Product, LRORetrysPutAsyncRelativeRetrySucceededHeaders>> putAsyncRelativeRetrySucceededAsync(Product product, final ServiceCallback<Product> serviceCallback) throws IllegalArgumentException;

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Product object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    ServiceResponseWithHeaders<Product, LRORetrysPutAsyncRelativeRetrySucceededHeaders> beginPutAsyncRelativeRetrySucceeded() throws CloudException, IOException;

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Product, LRORetrysPutAsyncRelativeRetrySucceededHeaders>> beginPutAsyncRelativeRetrySucceededAsync(final ServiceCallback<Product> serviceCallback) throws IllegalArgumentException;
    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Product object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    ServiceResponseWithHeaders<Product, LRORetrysPutAsyncRelativeRetrySucceededHeaders> beginPutAsyncRelativeRetrySucceeded(Product product) throws CloudException, IOException;

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Product, LRORetrysPutAsyncRelativeRetrySucceededHeaders>> beginPutAsyncRelativeRetrySucceededAsync(Product product, final ServiceCallback<Product> serviceCallback) throws IllegalArgumentException;

    /**
     * Long running delete request, service returns a 500, then a  202 to the initial request, with an entity that contains ProvisioningState=’Accepted’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    ServiceResponseWithHeaders<Product, LRORetrysDeleteProvisioning202Accepted200SucceededHeaders> deleteProvisioning202Accepted200Succeeded() throws CloudException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 500, then a  202 to the initial request, with an entity that contains ProvisioningState=’Accepted’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Product, LRORetrysDeleteProvisioning202Accepted200SucceededHeaders>> deleteProvisioning202Accepted200SucceededAsync(final ServiceCallback<Product> serviceCallback) throws IllegalArgumentException;

    /**
     * Long running delete request, service returns a 500, then a  202 to the initial request, with an entity that contains ProvisioningState=’Accepted’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Product object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    ServiceResponseWithHeaders<Product, LRORetrysDeleteProvisioning202Accepted200SucceededHeaders> beginDeleteProvisioning202Accepted200Succeeded() throws CloudException, IOException;

    /**
     * Long running delete request, service returns a 500, then a  202 to the initial request, with an entity that contains ProvisioningState=’Accepted’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Product, LRORetrysDeleteProvisioning202Accepted200SucceededHeaders>> beginDeleteProvisioning202Accepted200SucceededAsync(final ServiceCallback<Product> serviceCallback) throws IllegalArgumentException;

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysDelete202Retry200Headers> delete202Retry200() throws CloudException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Void, LRORetrysDelete202Retry200Headers>> delete202Retry200Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysDelete202Retry200Headers> beginDelete202Retry200() throws CloudException, IOException;

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Void, LRORetrysDelete202Retry200Headers>> beginDelete202Retry200Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysDeleteAsyncRelativeRetrySucceededHeaders> deleteAsyncRelativeRetrySucceeded() throws CloudException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Void, LRORetrysDeleteAsyncRelativeRetrySucceededHeaders>> deleteAsyncRelativeRetrySucceededAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysDeleteAsyncRelativeRetrySucceededHeaders> beginDeleteAsyncRelativeRetrySucceeded() throws CloudException, IOException;

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Void, LRORetrysDeleteAsyncRelativeRetrySucceededHeaders>> beginDeleteAsyncRelativeRetrySucceededAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysPost202Retry200Headers> post202Retry200() throws CloudException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Void, LRORetrysPost202Retry200Headers>> post202Retry200Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysPost202Retry200Headers> post202Retry200(Product product) throws CloudException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Void, LRORetrysPost202Retry200Headers>> post202Retry200Async(Product product, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysPost202Retry200Headers> beginPost202Retry200() throws CloudException, IOException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Void, LRORetrysPost202Retry200Headers>> beginPost202Retry200Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysPost202Retry200Headers> beginPost202Retry200(Product product) throws CloudException, IOException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Void, LRORetrysPost202Retry200Headers>> beginPost202Retry200Async(Product product, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysPostAsyncRelativeRetrySucceededHeaders> postAsyncRelativeRetrySucceeded() throws CloudException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Void, LRORetrysPostAsyncRelativeRetrySucceededHeaders>> postAsyncRelativeRetrySucceededAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysPostAsyncRelativeRetrySucceededHeaders> postAsyncRelativeRetrySucceeded(Product product) throws CloudException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Void, LRORetrysPostAsyncRelativeRetrySucceededHeaders>> postAsyncRelativeRetrySucceededAsync(Product product, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysPostAsyncRelativeRetrySucceededHeaders> beginPostAsyncRelativeRetrySucceeded() throws CloudException, IOException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Void, LRORetrysPostAsyncRelativeRetrySucceededHeaders>> beginPostAsyncRelativeRetrySucceededAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysPostAsyncRelativeRetrySucceededHeaders> beginPostAsyncRelativeRetrySucceeded(Product product) throws CloudException, IOException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponseWithHeaders<Void, LRORetrysPostAsyncRelativeRetrySucceededHeaders>> beginPostAsyncRelativeRetrySucceededAsync(Product product, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

}
