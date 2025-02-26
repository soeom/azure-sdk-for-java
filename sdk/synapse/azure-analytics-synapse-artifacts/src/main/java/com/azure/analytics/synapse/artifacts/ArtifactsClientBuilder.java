// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.ArtifactsClientImpl;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.Configuration;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** A builder for creating a new instance of the ArtifactsClient type. */
@ServiceClientBuilder(
        serviceClients = {
            LinkedServiceClient.class,
            DatasetClient.class,
            PipelineClient.class,
            PipelineRunClient.class,
            TriggerClient.class,
            TriggerRunClient.class,
            DataFlowClient.class,
            DataFlowDebugSessionClient.class,
            SqlScriptClient.class,
            SparkJobDefinitionClient.class,
            NotebookClient.class,
            NotebookOperationResultClient.class,
            SparkConfigurationClient.class,
            BigDataPoolsClient.class,
            WorkspaceGitRepoManagementClient.class,
            IntegrationRuntimesClient.class,
            LibraryClient.class,
            OperationResultClient.class,
            OperationStatusClient.class,
            SqlPoolsClient.class,
            WorkspaceClient.class,
            LinkedServiceAsyncClient.class,
            DatasetAsyncClient.class,
            PipelineAsyncClient.class,
            PipelineRunAsyncClient.class,
            TriggerAsyncClient.class,
            TriggerRunAsyncClient.class,
            DataFlowAsyncClient.class,
            DataFlowDebugSessionAsyncClient.class,
            SqlScriptAsyncClient.class,
            SparkJobDefinitionAsyncClient.class,
            NotebookAsyncClient.class,
            NotebookOperationResultAsyncClient.class,
            SparkConfigurationAsyncClient.class,
            BigDataPoolsAsyncClient.class,
            WorkspaceGitRepoManagementAsyncClient.class,
            IntegrationRuntimesAsyncClient.class,
            LibraryAsyncClient.class,
            OperationResultAsyncClient.class,
            OperationStatusAsyncClient.class,
            SqlPoolsAsyncClient.class,
            WorkspaceAsyncClient.class
        })
public final class ArtifactsClientBuilder {
    private static final String SDK_NAME = "name";

    private static final String SDK_VERSION = "version";

    static final String[] DEFAULT_SCOPES = new String[] {"https://dev.azuresynapse.net/.default"};

    private final Map<String, String> properties = new HashMap<>();

    /** Create an instance of the ArtifactsClientBuilder. */
    public ArtifactsClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The workspace development endpoint, for example
     * https://myworkspace.dev.azuresynapse.net.
     */
    private String endpoint;

    /**
     * Sets The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     *
     * @param endpoint the endpoint value.
     * @return the ArtifactsClientBuilder.
     */
    public ArtifactsClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * Api Version
     */
    private String apiVersion;

    /**
     * Sets Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the ArtifactsClientBuilder.
     */
    public ArtifactsClientBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the ArtifactsClientBuilder.
     */
    public ArtifactsClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializerAdapter the serializerAdapter value.
     * @return the ArtifactsClientBuilder.
     */
    public ArtifactsClientBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    private HttpClient httpClient;

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the ArtifactsClientBuilder.
     */
    public ArtifactsClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    private Configuration configuration;

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the ArtifactsClientBuilder.
     */
    public ArtifactsClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The TokenCredential used for authentication.
     */
    private TokenCredential tokenCredential;

    /**
     * Sets The TokenCredential used for authentication.
     *
     * @param tokenCredential the tokenCredential value.
     * @return the ArtifactsClientBuilder.
     */
    public ArtifactsClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    private HttpLogOptions httpLogOptions;

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the ArtifactsClientBuilder.
     */
    public ArtifactsClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the ArtifactsClientBuilder.
     */
    public ArtifactsClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /*
     * The list of Http pipeline policies to add.
     */
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the ArtifactsClientBuilder.
     */
    public ArtifactsClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /**
     * Builds an instance of ArtifactsClientImpl with the provided parameters.
     *
     * @return an instance of ArtifactsClientImpl.
     */
    private ArtifactsClientImpl buildInnerClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-06-01-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializerAdapter == null) {
            this.serializerAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        }
        ArtifactsClientImpl client = new ArtifactsClientImpl(pipeline, serializerAdapter, endpoint, apiVersion);
        return client;
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        policies.add(
                new UserAgentPolicy(httpLogOptions.getApplicationId(), clientName, clientVersion, buildConfiguration));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(retryPolicy == null ? new RetryPolicy() : retryPolicy);
        policies.add(new CookiePolicy());
        if (tokenCredential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPES));
        }
        policies.addAll(this.pipelinePolicies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of LinkedServiceAsyncClient async client.
     *
     * @return an instance of LinkedServiceAsyncClient.
     */
    public LinkedServiceAsyncClient buildLinkedServiceAsyncClient() {
        return new LinkedServiceAsyncClient(buildInnerClient().getLinkedServices());
    }

    /**
     * Builds an instance of DatasetAsyncClient async client.
     *
     * @return an instance of DatasetAsyncClient.
     */
    public DatasetAsyncClient buildDatasetAsyncClient() {
        return new DatasetAsyncClient(buildInnerClient().getDatasets());
    }

    /**
     * Builds an instance of PipelineAsyncClient async client.
     *
     * @return an instance of PipelineAsyncClient.
     */
    public PipelineAsyncClient buildPipelineAsyncClient() {
        return new PipelineAsyncClient(buildInnerClient().getPipelines());
    }

    /**
     * Builds an instance of PipelineRunAsyncClient async client.
     *
     * @return an instance of PipelineRunAsyncClient.
     */
    public PipelineRunAsyncClient buildPipelineRunAsyncClient() {
        return new PipelineRunAsyncClient(buildInnerClient().getPipelineRuns());
    }

    /**
     * Builds an instance of TriggerAsyncClient async client.
     *
     * @return an instance of TriggerAsyncClient.
     */
    public TriggerAsyncClient buildTriggerAsyncClient() {
        return new TriggerAsyncClient(buildInnerClient().getTriggers());
    }

    /**
     * Builds an instance of TriggerRunAsyncClient async client.
     *
     * @return an instance of TriggerRunAsyncClient.
     */
    public TriggerRunAsyncClient buildTriggerRunAsyncClient() {
        return new TriggerRunAsyncClient(buildInnerClient().getTriggerRuns());
    }

    /**
     * Builds an instance of DataFlowAsyncClient async client.
     *
     * @return an instance of DataFlowAsyncClient.
     */
    public DataFlowAsyncClient buildDataFlowAsyncClient() {
        return new DataFlowAsyncClient(buildInnerClient().getDataFlows());
    }

    /**
     * Builds an instance of DataFlowDebugSessionAsyncClient async client.
     *
     * @return an instance of DataFlowDebugSessionAsyncClient.
     */
    public DataFlowDebugSessionAsyncClient buildDataFlowDebugSessionAsyncClient() {
        return new DataFlowDebugSessionAsyncClient(buildInnerClient().getDataFlowDebugSessions());
    }

    /**
     * Builds an instance of SqlScriptAsyncClient async client.
     *
     * @return an instance of SqlScriptAsyncClient.
     */
    public SqlScriptAsyncClient buildSqlScriptAsyncClient() {
        return new SqlScriptAsyncClient(buildInnerClient().getSqlScripts());
    }

    /**
     * Builds an instance of SparkJobDefinitionAsyncClient async client.
     *
     * @return an instance of SparkJobDefinitionAsyncClient.
     */
    public SparkJobDefinitionAsyncClient buildSparkJobDefinitionAsyncClient() {
        return new SparkJobDefinitionAsyncClient(buildInnerClient().getSparkJobDefinitions());
    }

    /**
     * Builds an instance of NotebookAsyncClient async client.
     *
     * @return an instance of NotebookAsyncClient.
     */
    public NotebookAsyncClient buildNotebookAsyncClient() {
        return new NotebookAsyncClient(buildInnerClient().getNotebooks());
    }

    /**
     * Builds an instance of NotebookOperationResultAsyncClient async client.
     *
     * @return an instance of NotebookOperationResultAsyncClient.
     */
    public NotebookOperationResultAsyncClient buildNotebookOperationResultAsyncClient() {
        return new NotebookOperationResultAsyncClient(buildInnerClient().getNotebookOperationResults());
    }

    /**
     * Builds an instance of SparkConfigurationAsyncClient async client.
     *
     * @return an instance of SparkConfigurationAsyncClient.
     */
    public SparkConfigurationAsyncClient buildSparkConfigurationAsyncClient() {
        return new SparkConfigurationAsyncClient(buildInnerClient().getSparkConfigurations());
    }

    /**
     * Builds an instance of BigDataPoolsAsyncClient async client.
     *
     * @return an instance of BigDataPoolsAsyncClient.
     */
    public BigDataPoolsAsyncClient buildBigDataPoolsAsyncClient() {
        return new BigDataPoolsAsyncClient(buildInnerClient().getBigDataPools());
    }

    /**
     * Builds an instance of WorkspaceGitRepoManagementAsyncClient async client.
     *
     * @return an instance of WorkspaceGitRepoManagementAsyncClient.
     */
    public WorkspaceGitRepoManagementAsyncClient buildWorkspaceGitRepoManagementAsyncClient() {
        return new WorkspaceGitRepoManagementAsyncClient(buildInnerClient().getWorkspaceGitRepoManagements());
    }

    /**
     * Builds an instance of IntegrationRuntimesAsyncClient async client.
     *
     * @return an instance of IntegrationRuntimesAsyncClient.
     */
    public IntegrationRuntimesAsyncClient buildIntegrationRuntimesAsyncClient() {
        return new IntegrationRuntimesAsyncClient(buildInnerClient().getIntegrationRuntimes());
    }

    /**
     * Builds an instance of LibraryAsyncClient async client.
     *
     * @return an instance of LibraryAsyncClient.
     */
    public LibraryAsyncClient buildLibraryAsyncClient() {
        return new LibraryAsyncClient(buildInnerClient().getLibraries());
    }

    /**
     * Builds an instance of OperationResultAsyncClient async client.
     *
     * @return an instance of OperationResultAsyncClient.
     */
    public OperationResultAsyncClient buildOperationResultAsyncClient() {
        return new OperationResultAsyncClient(buildInnerClient().getOperationResults());
    }

    /**
     * Builds an instance of OperationStatusAsyncClient async client.
     *
     * @return an instance of OperationStatusAsyncClient.
     */
    public OperationStatusAsyncClient buildOperationStatusAsyncClient() {
        return new OperationStatusAsyncClient(buildInnerClient().getOperationStatus());
    }

    /**
     * Builds an instance of SqlPoolsAsyncClient async client.
     *
     * @return an instance of SqlPoolsAsyncClient.
     */
    public SqlPoolsAsyncClient buildSqlPoolsAsyncClient() {
        return new SqlPoolsAsyncClient(buildInnerClient().getSqlPools());
    }

    /**
     * Builds an instance of WorkspaceAsyncClient async client.
     *
     * @return an instance of WorkspaceAsyncClient.
     */
    public WorkspaceAsyncClient buildWorkspaceAsyncClient() {
        return new WorkspaceAsyncClient(buildInnerClient().getWorkspaces());
    }

    /**
     * Builds an instance of LinkedServiceClient sync client.
     *
     * @return an instance of LinkedServiceClient.
     */
    public LinkedServiceClient buildLinkedServiceClient() {
        return new LinkedServiceClient(buildInnerClient().getLinkedServices());
    }

    /**
     * Builds an instance of DatasetClient sync client.
     *
     * @return an instance of DatasetClient.
     */
    public DatasetClient buildDatasetClient() {
        return new DatasetClient(buildInnerClient().getDatasets());
    }

    /**
     * Builds an instance of PipelineClient sync client.
     *
     * @return an instance of PipelineClient.
     */
    public PipelineClient buildPipelineClient() {
        return new PipelineClient(buildInnerClient().getPipelines());
    }

    /**
     * Builds an instance of PipelineRunClient sync client.
     *
     * @return an instance of PipelineRunClient.
     */
    public PipelineRunClient buildPipelineRunClient() {
        return new PipelineRunClient(buildInnerClient().getPipelineRuns());
    }

    /**
     * Builds an instance of TriggerClient sync client.
     *
     * @return an instance of TriggerClient.
     */
    public TriggerClient buildTriggerClient() {
        return new TriggerClient(buildInnerClient().getTriggers());
    }

    /**
     * Builds an instance of TriggerRunClient sync client.
     *
     * @return an instance of TriggerRunClient.
     */
    public TriggerRunClient buildTriggerRunClient() {
        return new TriggerRunClient(buildInnerClient().getTriggerRuns());
    }

    /**
     * Builds an instance of DataFlowClient sync client.
     *
     * @return an instance of DataFlowClient.
     */
    public DataFlowClient buildDataFlowClient() {
        return new DataFlowClient(buildInnerClient().getDataFlows());
    }

    /**
     * Builds an instance of DataFlowDebugSessionClient sync client.
     *
     * @return an instance of DataFlowDebugSessionClient.
     */
    public DataFlowDebugSessionClient buildDataFlowDebugSessionClient() {
        return new DataFlowDebugSessionClient(buildInnerClient().getDataFlowDebugSessions());
    }

    /**
     * Builds an instance of SqlScriptClient sync client.
     *
     * @return an instance of SqlScriptClient.
     */
    public SqlScriptClient buildSqlScriptClient() {
        return new SqlScriptClient(buildInnerClient().getSqlScripts());
    }

    /**
     * Builds an instance of SparkJobDefinitionClient sync client.
     *
     * @return an instance of SparkJobDefinitionClient.
     */
    public SparkJobDefinitionClient buildSparkJobDefinitionClient() {
        return new SparkJobDefinitionClient(buildInnerClient().getSparkJobDefinitions());
    }

    /**
     * Builds an instance of NotebookClient sync client.
     *
     * @return an instance of NotebookClient.
     */
    public NotebookClient buildNotebookClient() {
        return new NotebookClient(buildInnerClient().getNotebooks());
    }

    /**
     * Builds an instance of NotebookOperationResultClient sync client.
     *
     * @return an instance of NotebookOperationResultClient.
     */
    public NotebookOperationResultClient buildNotebookOperationResultClient() {
        return new NotebookOperationResultClient(buildInnerClient().getNotebookOperationResults());
    }

    /**
     * Builds an instance of SparkConfigurationClient sync client.
     *
     * @return an instance of SparkConfigurationClient.
     */
    public SparkConfigurationClient buildSparkConfigurationClient() {
        return new SparkConfigurationClient(buildInnerClient().getSparkConfigurations());
    }

    /**
     * Builds an instance of BigDataPoolsClient sync client.
     *
     * @return an instance of BigDataPoolsClient.
     */
    public BigDataPoolsClient buildBigDataPoolsClient() {
        return new BigDataPoolsClient(buildInnerClient().getBigDataPools());
    }

    /**
     * Builds an instance of WorkspaceGitRepoManagementClient sync client.
     *
     * @return an instance of WorkspaceGitRepoManagementClient.
     */
    public WorkspaceGitRepoManagementClient buildWorkspaceGitRepoManagementClient() {
        return new WorkspaceGitRepoManagementClient(buildInnerClient().getWorkspaceGitRepoManagements());
    }

    /**
     * Builds an instance of IntegrationRuntimesClient sync client.
     *
     * @return an instance of IntegrationRuntimesClient.
     */
    public IntegrationRuntimesClient buildIntegrationRuntimesClient() {
        return new IntegrationRuntimesClient(buildInnerClient().getIntegrationRuntimes());
    }

    /**
     * Builds an instance of LibraryClient sync client.
     *
     * @return an instance of LibraryClient.
     */
    public LibraryClient buildLibraryClient() {
        return new LibraryClient(buildInnerClient().getLibraries());
    }

    /**
     * Builds an instance of OperationResultClient sync client.
     *
     * @return an instance of OperationResultClient.
     */
    public OperationResultClient buildOperationResultClient() {
        return new OperationResultClient(buildInnerClient().getOperationResults());
    }

    /**
     * Builds an instance of OperationStatusClient sync client.
     *
     * @return an instance of OperationStatusClient.
     */
    public OperationStatusClient buildOperationStatusClient() {
        return new OperationStatusClient(buildInnerClient().getOperationStatus());
    }

    /**
     * Builds an instance of SqlPoolsClient sync client.
     *
     * @return an instance of SqlPoolsClient.
     */
    public SqlPoolsClient buildSqlPoolsClient() {
        return new SqlPoolsClient(buildInnerClient().getSqlPools());
    }

    /**
     * Builds an instance of WorkspaceClient sync client.
     *
     * @return an instance of WorkspaceClient.
     */
    public WorkspaceClient buildWorkspaceClient() {
        return new WorkspaceClient(buildInnerClient().getWorkspaces());
    }
}
