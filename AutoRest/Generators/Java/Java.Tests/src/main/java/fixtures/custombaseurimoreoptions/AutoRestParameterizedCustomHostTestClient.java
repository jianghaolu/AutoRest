/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.custombaseurimoreoptions;

import com.microsoft.rest.RestClient;

/**
 * The interface for AutoRestParameterizedCustomHostTestClient class.
 */
public interface AutoRestParameterizedCustomHostTestClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
     */
     RestClient restClient();

    /**
     * Gets The subscription id with value 'test12'..
     *
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * Sets The subscription id with value 'test12'..
     *
     * @param subscriptionId the subscriptionId value.
     */
    void withSubscriptionId(String subscriptionId);

    /**
     * Gets A string value that is used as a global part of the parameterized host. Default value 'host'..
     *
     * @return the dnsSuffix value.
     */
    String dnsSuffix();

    /**
     * Sets A string value that is used as a global part of the parameterized host. Default value 'host'..
     *
     * @param dnsSuffix the dnsSuffix value.
     */
    void withDnsSuffix(String dnsSuffix);

    /**
     * Gets the Paths object to access its operations.
     * @return the Paths object.
     */
    Paths paths();

}
