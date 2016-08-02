/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.http.models.Error;
import fixtures.http.models.ErrorException;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpClientFailures.
 */
public interface HttpClientFailures {
    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> head400() throws ErrorException, IOException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> head400Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> get400() throws ErrorException, IOException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> get400Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> put400() throws ErrorException, IOException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> put400Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;
    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> put400(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> put400Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> patch400() throws ErrorException, IOException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> patch400Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;
    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> patch400(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> patch400Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> post400() throws ErrorException, IOException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> post400Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;
    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> post400(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> post400Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> delete400() throws ErrorException, IOException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> delete400Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;
    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> delete400(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> delete400Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 401 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> head401() throws ErrorException, IOException;

    /**
     * Return 401 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> head401Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 402 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> get402() throws ErrorException, IOException;

    /**
     * Return 402 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> get402Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 403 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> get403() throws ErrorException, IOException;

    /**
     * Return 403 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> get403Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 404 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> put404() throws ErrorException, IOException;

    /**
     * Return 404 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> put404Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;
    /**
     * Return 404 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> put404(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 404 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> put404Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 405 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> patch405() throws ErrorException, IOException;

    /**
     * Return 405 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> patch405Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;
    /**
     * Return 405 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> patch405(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 405 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> patch405Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 406 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> post406() throws ErrorException, IOException;

    /**
     * Return 406 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> post406Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;
    /**
     * Return 406 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> post406(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 406 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> post406Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 407 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> delete407() throws ErrorException, IOException;

    /**
     * Return 407 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> delete407Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;
    /**
     * Return 407 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> delete407(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 407 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> delete407Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 409 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> put409() throws ErrorException, IOException;

    /**
     * Return 409 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> put409Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;
    /**
     * Return 409 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> put409(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 409 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> put409Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 410 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> head410() throws ErrorException, IOException;

    /**
     * Return 410 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> head410Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 411 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> get411() throws ErrorException, IOException;

    /**
     * Return 411 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> get411Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 412 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> get412() throws ErrorException, IOException;

    /**
     * Return 412 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> get412Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 413 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> put413() throws ErrorException, IOException;

    /**
     * Return 413 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> put413Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;
    /**
     * Return 413 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> put413(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 413 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> put413Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 414 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> patch414() throws ErrorException, IOException;

    /**
     * Return 414 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> patch414Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;
    /**
     * Return 414 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> patch414(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 414 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> patch414Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 415 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> post415() throws ErrorException, IOException;

    /**
     * Return 415 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> post415Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;
    /**
     * Return 415 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> post415(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 415 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> post415Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 416 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> get416() throws ErrorException, IOException;

    /**
     * Return 416 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> get416Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 417 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> delete417() throws ErrorException, IOException;

    /**
     * Return 417 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> delete417Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;
    /**
     * Return 417 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> delete417(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 417 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> delete417Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 429 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> head429() throws ErrorException, IOException;

    /**
     * Return 429 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Error>> head429Async(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

}
