package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.core.KafkaTemplate;

import static org.mockito.Mockito.*;

class KafkaProducerServiceGeneratedAiTests {

    @Mock
    private KafkaTemplate<String, String> kafkaTemplate;

    @InjectMocks
    private KafkaProducerService kafkaProducerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSend() {
        // GIVEN
        String message = "test message";
        // WHEN
        kafkaProducerService.send(message);
        // THEN
        verify(kafkaTemplate, times(1)).send("my-topic", message);
    }
}
/*
2025-08-02 11:59:09.103 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:36)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
2025-08-02 11:59:09.153 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Generating code...
2025-08-02 11:59:09.168 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Using prompt:

There is an error in the previously generated test class.

>> ERROR:

[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.2.5:test (default-test) on project SpringBootKafka: No tests matching pattern "KafkaProducerServiceGeneratedAiTests" were executed! (Set -Dsurefire.failIfNoSpecifiedTests=false to ignore this error.) -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException


# TASK: Correct the error in the test class.

# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.

2025-08-02 11:59:09.171 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-08-02 12:01:16.809 ERROR [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:49)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - AI ERROR - did not generate response
java.lang.RuntimeException: java.net.ConnectException
	at dev.langchain4j.http.client.jdk.JdkHttpClient.execute(JdkHttpClient.java:60)
	at dev.langchain4j.model.ollama.OllamaClient.chat(OllamaClient.java:101)
	at dev.langchain4j.model.ollama.OllamaChatModel.lambda$doChat$0(OllamaChatModel.java:41)
	at dev.langchain4j.internal.ExceptionMapper.withExceptionMapper(ExceptionMapper.java:29)
	at dev.langchain4j.internal.RetryUtils.lambda$withRetryMappingExceptions$2(RetryUtils.java:322)
	at dev.langchain4j.internal.RetryUtils$RetryPolicy.withRetry(RetryUtils.java:204)
	at dev.langchain4j.internal.RetryUtils.withRetry(RetryUtils.java:259)
	at dev.langchain4j.internal.RetryUtils.withRetryMappingExceptions(RetryUtils.java:322)
	at dev.langchain4j.internal.RetryUtils.withRetryMappingExceptions(RetryUtils.java:305)
	at dev.langchain4j.model.ollama.OllamaChatModel.doChat(OllamaChatModel.java:41)
	at dev.langchain4j.model.chat.ChatModel.chat(ChatModel.java:46)
	at dev.langchain4j.model.chat.ChatModel.chat(ChatModel.java:92)
	at io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:44)
	at io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:113)
	at io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:79)
	at io.github.adamw7.orchestrator.generator.persistence.PersistingGenerator.create(PersistingGenerator.java:32)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:63)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:122)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.create(RetryUntilTestSuccessGenerator.java:52)
	at io.github.adamw7.orchestrator.generator.SpeedUpSlowTestsGenerator.createInternal(SpeedUpSlowTestsGenerator.java:30)
	at io.github.adamw7.orchestrator.generator.SpeedUpSlowTestsGenerator.create(SpeedUpSlowTestsGenerator.java:22)
	at io.github.adamw7.testing.generator.persistence.CodeRevertingGenerator.create(CodeRevertingGenerator.java:43)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:575)
	at java.base/java.util.stream.AbstractPipeline.evaluateToArrayNode(AbstractPipeline.java:260)
	at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:616)
	at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:622)
	at java.base/java.util.stream.ReferencePipeline.toList(ReferencePipeline.java:627)
	at io.github.adamw7.testing.steps.BaseClassContainerGeneratorStep.filterAndGenerateClasses(BaseClassContainerGeneratorStep.java:27)
	at io.github.adamw7.testing.steps.GenerateUnitTestStep.process(GenerateUnitTestStep.java:35)
	at io.github.adamw7.testing.steps.ProcessingPipeline.execute(ProcessingPipeline.java:17)
	at io.github.adamw7.testing.engine.UnitTestingEngine.execute(UnitTestingEngine.java:72)
	at io.github.adamw7.testing.cases.TestCase.execute(TestCase.java:21)
	at io.github.adamw7.testing.services.OrchestrationClientFacadeImpl.execute(OrchestrationClientFacadeImpl.java:15)
	at io.github.adamw7.testing.UnitTesting$1.run(UnitTesting.java:43)
	at org.springframework.boot.SpringApplication.lambda$callRunner$5(SpringApplication.java:788)
	at org.springframework.util.function.ThrowingConsumer$1.acceptWithException(ThrowingConsumer.java:82)
	at org.springframework.util.function.ThrowingConsumer.accept(ThrowingConsumer.java:60)
	at org.springframework.util.function.ThrowingConsumer$1.accept(ThrowingConsumer.java:86)
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:796)
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:787)
	at org.springframework.boot.SpringApplication.lambda$callRunners$3(SpringApplication.java:772)
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
	at java.base/java.util.stream.SortedOps$SizedRefSortingSink.end(SortedOps.java:357)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:510)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596)
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:772)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:325)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350)
	at io.github.adamw7.testing.UnitTesting.main(UnitTesting.java:31)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)
Caused by: java.net.ConnectException
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:573)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:123)
	at dev.langchain4j.http.client.jdk.JdkHttpClient.execute(JdkHttpClient.java:50)
	... 68 more
Caused by: java.net.ConnectException
	at java.net.http/jdk.internal.net.http.common.Utils.toConnectException(Utils.java:1055)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.connectAsync(PlainHttpConnection.java:198)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.checkRetryConnect(PlainHttpConnection.java:230)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.lambda$connectAsync$1(PlainHttpConnection.java:206)
	at java.base/java.util.concurrent.CompletableFuture.uniHandle(CompletableFuture.java:934)
	at java.base/java.util.concurrent.CompletableFuture$UniHandle.tryFire(CompletableFuture.java:911)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1773)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: java.nio.channels.ClosedChannelException
	at java.base/sun.nio.ch.SocketChannelImpl.ensureOpen(SocketChannelImpl.java:195)
	at java.base/sun.nio.ch.SocketChannelImpl.beginConnect(SocketChannelImpl.java:760)
	at java.base/sun.nio.ch.SocketChannelImpl.connect(SocketChannelImpl.java:848)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.lambda$connectAsync$0(PlainHttpConnection.java:183)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:569)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.connectAsync(PlainHttpConnection.java:185)
	... 9 more
2025-08-02 12:01:16.827 WARN [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:115)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Failed to generate code
2025-08-02 12:01:16.829 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Done
2025-08-02 12:01:16.829 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Generated code:

2025-08-02 12:01:16.840 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Refining code...
2025-08-02 12:01:16.844 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Done
2025-08-02 12:03:44.953 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-08-02 12:03:44.958 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Generating code...
2025-08-02 12:03:44.958 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional.empty

In this code:

package com.jarvis.springbootkafka.service;




# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Make sure add all missing import statements.
6. Give output as a plain text

2025-08-02 12:03:44.966 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-08-02 12:05:52.654 ERROR [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:49)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - AI ERROR - did not generate response
java.lang.RuntimeException: java.net.ConnectException
	at dev.langchain4j.http.client.jdk.JdkHttpClient.execute(JdkHttpClient.java:60)
	at dev.langchain4j.model.ollama.OllamaClient.chat(OllamaClient.java:101)
	at dev.langchain4j.model.ollama.OllamaChatModel.lambda$doChat$0(OllamaChatModel.java:41)
	at dev.langchain4j.internal.ExceptionMapper.withExceptionMapper(ExceptionMapper.java:29)
	at dev.langchain4j.internal.RetryUtils.lambda$withRetryMappingExceptions$2(RetryUtils.java:322)
	at dev.langchain4j.internal.RetryUtils$RetryPolicy.withRetry(RetryUtils.java:204)
	at dev.langchain4j.internal.RetryUtils.withRetry(RetryUtils.java:259)
	at dev.langchain4j.internal.RetryUtils.withRetryMappingExceptions(RetryUtils.java:322)
	at dev.langchain4j.internal.RetryUtils.withRetryMappingExceptions(RetryUtils.java:305)
	at dev.langchain4j.model.ollama.OllamaChatModel.doChat(OllamaChatModel.java:41)
	at dev.langchain4j.model.chat.ChatModel.chat(ChatModel.java:46)
	at dev.langchain4j.model.chat.ChatModel.chat(ChatModel.java:92)
	at io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:44)
	at io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:113)
	at io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:79)
	at io.github.adamw7.orchestrator.generator.persistence.PersistingGenerator.create(PersistingGenerator.java:32)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:63)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:122)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:122)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.create(RetryUntilTestSuccessGenerator.java:52)
	at io.github.adamw7.orchestrator.generator.SpeedUpSlowTestsGenerator.createInternal(SpeedUpSlowTestsGenerator.java:30)
	at io.github.adamw7.orchestrator.generator.SpeedUpSlowTestsGenerator.create(SpeedUpSlowTestsGenerator.java:22)
	at io.github.adamw7.testing.generator.persistence.CodeRevertingGenerator.create(CodeRevertingGenerator.java:43)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:575)
	at java.base/java.util.stream.AbstractPipeline.evaluateToArrayNode(AbstractPipeline.java:260)
	at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:616)
	at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:622)
	at java.base/java.util.stream.ReferencePipeline.toList(ReferencePipeline.java:627)
	at io.github.adamw7.testing.steps.BaseClassContainerGeneratorStep.filterAndGenerateClasses(BaseClassContainerGeneratorStep.java:27)
	at io.github.adamw7.testing.steps.GenerateUnitTestStep.process(GenerateUnitTestStep.java:35)
	at io.github.adamw7.testing.steps.ProcessingPipeline.execute(ProcessingPipeline.java:17)
	at io.github.adamw7.testing.engine.UnitTestingEngine.execute(UnitTestingEngine.java:72)
	at io.github.adamw7.testing.cases.TestCase.execute(TestCase.java:21)
	at io.github.adamw7.testing.services.OrchestrationClientFacadeImpl.execute(OrchestrationClientFacadeImpl.java:15)
	at io.github.adamw7.testing.UnitTesting$1.run(UnitTesting.java:43)
	at org.springframework.boot.SpringApplication.lambda$callRunner$5(SpringApplication.java:788)
	at org.springframework.util.function.ThrowingConsumer$1.acceptWithException(ThrowingConsumer.java:82)
	at org.springframework.util.function.ThrowingConsumer.accept(ThrowingConsumer.java:60)
	at org.springframework.util.function.ThrowingConsumer$1.accept(ThrowingConsumer.java:86)
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:796)
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:787)
	at org.springframework.boot.SpringApplication.lambda$callRunners$3(SpringApplication.java:772)
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
	at java.base/java.util.stream.SortedOps$SizedRefSortingSink.end(SortedOps.java:357)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:510)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596)
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:772)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:325)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350)
	at io.github.adamw7.testing.UnitTesting.main(UnitTesting.java:31)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)
Caused by: java.net.ConnectException
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:573)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:123)
	at dev.langchain4j.http.client.jdk.JdkHttpClient.execute(JdkHttpClient.java:50)
	... 69 more
Caused by: java.net.ConnectException
	at java.net.http/jdk.internal.net.http.common.Utils.toConnectException(Utils.java:1055)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.connectAsync(PlainHttpConnection.java:198)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.checkRetryConnect(PlainHttpConnection.java:230)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.lambda$connectAsync$1(PlainHttpConnection.java:206)
	at java.base/java.util.concurrent.CompletableFuture.uniHandle(CompletableFuture.java:934)
	at java.base/java.util.concurrent.CompletableFuture$UniHandle.tryFire(CompletableFuture.java:911)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1773)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: java.nio.channels.ClosedChannelException
	at java.base/sun.nio.ch.SocketChannelImpl.ensureOpen(SocketChannelImpl.java:195)
	at java.base/sun.nio.ch.SocketChannelImpl.beginConnect(SocketChannelImpl.java:760)
	at java.base/sun.nio.ch.SocketChannelImpl.connect(SocketChannelImpl.java:848)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.lambda$connectAsync$0(PlainHttpConnection.java:183)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:569)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.connectAsync(PlainHttpConnection.java:185)
	... 9 more
2025-08-02 12:05:52.681 WARN [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:115)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Failed to generate code
2025-08-02 12:05:52.684 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Done
2025-08-02 12:05:52.685 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Generated code:

2025-08-02 12:05:52.687 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Refining code...
2025-08-02 12:05:52.696 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Done
2025-08-02 12:06:18.418 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-08-02 12:06:18.420 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Generating code...
2025-08-02 12:06:18.421 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional.empty

In this code:

package com.jarvis.springbootkafka.service;




# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Make sure add all missing import statements.
6. Give output as a plain text

2025-08-02 12:06:18.423 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-08-02 12:08:26.089 ERROR [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:49)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - AI ERROR - did not generate response
java.lang.RuntimeException: java.net.ConnectException
	at dev.langchain4j.http.client.jdk.JdkHttpClient.execute(JdkHttpClient.java:60)
	at dev.langchain4j.model.ollama.OllamaClient.chat(OllamaClient.java:101)
	at dev.langchain4j.model.ollama.OllamaChatModel.lambda$doChat$0(OllamaChatModel.java:41)
	at dev.langchain4j.internal.ExceptionMapper.withExceptionMapper(ExceptionMapper.java:29)
	at dev.langchain4j.internal.RetryUtils.lambda$withRetryMappingExceptions$2(RetryUtils.java:322)
	at dev.langchain4j.internal.RetryUtils$RetryPolicy.withRetry(RetryUtils.java:204)
	at dev.langchain4j.internal.RetryUtils.withRetry(RetryUtils.java:259)
	at dev.langchain4j.internal.RetryUtils.withRetryMappingExceptions(RetryUtils.java:322)
	at dev.langchain4j.internal.RetryUtils.withRetryMappingExceptions(RetryUtils.java:305)
	at dev.langchain4j.model.ollama.OllamaChatModel.doChat(OllamaChatModel.java:41)
	at dev.langchain4j.model.chat.ChatModel.chat(ChatModel.java:46)
	at dev.langchain4j.model.chat.ChatModel.chat(ChatModel.java:92)
	at io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:44)
	at io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:113)
	at io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:79)
	at io.github.adamw7.orchestrator.generator.persistence.PersistingGenerator.create(PersistingGenerator.java:32)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:63)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:122)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:122)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:122)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.create(RetryUntilTestSuccessGenerator.java:52)
	at io.github.adamw7.orchestrator.generator.SpeedUpSlowTestsGenerator.createInternal(SpeedUpSlowTestsGenerator.java:30)
	at io.github.adamw7.orchestrator.generator.SpeedUpSlowTestsGenerator.create(SpeedUpSlowTestsGenerator.java:22)
	at io.github.adamw7.testing.generator.persistence.CodeRevertingGenerator.create(CodeRevertingGenerator.java:43)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:575)
	at java.base/java.util.stream.AbstractPipeline.evaluateToArrayNode(AbstractPipeline.java:260)
	at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:616)
	at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:622)
	at java.base/java.util.stream.ReferencePipeline.toList(ReferencePipeline.java:627)
	at io.github.adamw7.testing.steps.BaseClassContainerGeneratorStep.filterAndGenerateClasses(BaseClassContainerGeneratorStep.java:27)
	at io.github.adamw7.testing.steps.GenerateUnitTestStep.process(GenerateUnitTestStep.java:35)
	at io.github.adamw7.testing.steps.ProcessingPipeline.execute(ProcessingPipeline.java:17)
	at io.github.adamw7.testing.engine.UnitTestingEngine.execute(UnitTestingEngine.java:72)
	at io.github.adamw7.testing.cases.TestCase.execute(TestCase.java:21)
	at io.github.adamw7.testing.services.OrchestrationClientFacadeImpl.execute(OrchestrationClientFacadeImpl.java:15)
	at io.github.adamw7.testing.UnitTesting$1.run(UnitTesting.java:43)
	at org.springframework.boot.SpringApplication.lambda$callRunner$5(SpringApplication.java:788)
	at org.springframework.util.function.ThrowingConsumer$1.acceptWithException(ThrowingConsumer.java:82)
	at org.springframework.util.function.ThrowingConsumer.accept(ThrowingConsumer.java:60)
	at org.springframework.util.function.ThrowingConsumer$1.accept(ThrowingConsumer.java:86)
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:796)
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:787)
	at org.springframework.boot.SpringApplication.lambda$callRunners$3(SpringApplication.java:772)
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
	at java.base/java.util.stream.SortedOps$SizedRefSortingSink.end(SortedOps.java:357)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:510)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596)
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:772)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:325)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350)
	at io.github.adamw7.testing.UnitTesting.main(UnitTesting.java:31)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)
Caused by: java.net.ConnectException
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:573)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:123)
	at dev.langchain4j.http.client.jdk.JdkHttpClient.execute(JdkHttpClient.java:50)
	... 70 more
Caused by: java.net.ConnectException
	at java.net.http/jdk.internal.net.http.common.Utils.toConnectException(Utils.java:1055)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.connectAsync(PlainHttpConnection.java:198)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.checkRetryConnect(PlainHttpConnection.java:230)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.lambda$connectAsync$1(PlainHttpConnection.java:206)
	at java.base/java.util.concurrent.CompletableFuture.uniHandle(CompletableFuture.java:934)
	at java.base/java.util.concurrent.CompletableFuture$UniHandle.tryFire(CompletableFuture.java:911)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1773)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: java.nio.channels.ClosedChannelException
	at java.base/sun.nio.ch.SocketChannelImpl.ensureOpen(SocketChannelImpl.java:195)
	at java.base/sun.nio.ch.SocketChannelImpl.beginConnect(SocketChannelImpl.java:760)
	at java.base/sun.nio.ch.SocketChannelImpl.connect(SocketChannelImpl.java:848)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.lambda$connectAsync$0(PlainHttpConnection.java:183)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:569)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.connectAsync(PlainHttpConnection.java:185)
	... 9 more
2025-08-02 12:08:26.100 WARN [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:115)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Failed to generate code
2025-08-02 12:08:26.100 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Done
2025-08-02 12:08:26.101 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Generated code:

2025-08-02 12:08:26.101 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Refining code...
2025-08-02 12:08:26.102 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Done
2025-08-02 12:08:48.656 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-08-02 12:08:48.657 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Generating code...
2025-08-02 12:08:48.657 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional.empty

In this code:

package com.jarvis.springbootkafka.service;




# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Make sure add all missing import statements.
6. Give output as a plain text

2025-08-02 12:08:48.659 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-08-02 12:10:56.207 ERROR [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:49)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - AI ERROR - did not generate response
java.lang.RuntimeException: java.net.ConnectException
	at dev.langchain4j.http.client.jdk.JdkHttpClient.execute(JdkHttpClient.java:60)
	at dev.langchain4j.model.ollama.OllamaClient.chat(OllamaClient.java:101)
	at dev.langchain4j.model.ollama.OllamaChatModel.lambda$doChat$0(OllamaChatModel.java:41)
	at dev.langchain4j.internal.ExceptionMapper.withExceptionMapper(ExceptionMapper.java:29)
	at dev.langchain4j.internal.RetryUtils.lambda$withRetryMappingExceptions$2(RetryUtils.java:322)
	at dev.langchain4j.internal.RetryUtils$RetryPolicy.withRetry(RetryUtils.java:204)
	at dev.langchain4j.internal.RetryUtils.withRetry(RetryUtils.java:259)
	at dev.langchain4j.internal.RetryUtils.withRetryMappingExceptions(RetryUtils.java:322)
	at dev.langchain4j.internal.RetryUtils.withRetryMappingExceptions(RetryUtils.java:305)
	at dev.langchain4j.model.ollama.OllamaChatModel.doChat(OllamaChatModel.java:41)
	at dev.langchain4j.model.chat.ChatModel.chat(ChatModel.java:46)
	at dev.langchain4j.model.chat.ChatModel.chat(ChatModel.java:92)
	at io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:44)
	at io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:113)
	at io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:79)
	at io.github.adamw7.orchestrator.generator.persistence.PersistingGenerator.create(PersistingGenerator.java:32)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:63)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:122)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:122)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:122)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.createInternal(RetryUntilTestSuccessGenerator.java:122)
	at io.github.adamw7.orchestrator.generator.RetryUntilTestSuccessGenerator.create(RetryUntilTestSuccessGenerator.java:52)
	at io.github.adamw7.orchestrator.generator.SpeedUpSlowTestsGenerator.createInternal(SpeedUpSlowTestsGenerator.java:30)
	at io.github.adamw7.orchestrator.generator.SpeedUpSlowTestsGenerator.create(SpeedUpSlowTestsGenerator.java:22)
	at io.github.adamw7.testing.generator.persistence.CodeRevertingGenerator.create(CodeRevertingGenerator.java:43)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:575)
	at java.base/java.util.stream.AbstractPipeline.evaluateToArrayNode(AbstractPipeline.java:260)
	at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:616)
	at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:622)
	at java.base/java.util.stream.ReferencePipeline.toList(ReferencePipeline.java:627)
	at io.github.adamw7.testing.steps.BaseClassContainerGeneratorStep.filterAndGenerateClasses(BaseClassContainerGeneratorStep.java:27)
	at io.github.adamw7.testing.steps.GenerateUnitTestStep.process(GenerateUnitTestStep.java:35)
	at io.github.adamw7.testing.steps.ProcessingPipeline.execute(ProcessingPipeline.java:17)
	at io.github.adamw7.testing.engine.UnitTestingEngine.execute(UnitTestingEngine.java:72)
	at io.github.adamw7.testing.cases.TestCase.execute(TestCase.java:21)
	at io.github.adamw7.testing.services.OrchestrationClientFacadeImpl.execute(OrchestrationClientFacadeImpl.java:15)
	at io.github.adamw7.testing.UnitTesting$1.run(UnitTesting.java:43)
	at org.springframework.boot.SpringApplication.lambda$callRunner$5(SpringApplication.java:788)
	at org.springframework.util.function.ThrowingConsumer$1.acceptWithException(ThrowingConsumer.java:82)
	at org.springframework.util.function.ThrowingConsumer.accept(ThrowingConsumer.java:60)
	at org.springframework.util.function.ThrowingConsumer$1.accept(ThrowingConsumer.java:86)
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:796)
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:787)
	at org.springframework.boot.SpringApplication.lambda$callRunners$3(SpringApplication.java:772)
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
	at java.base/java.util.stream.SortedOps$SizedRefSortingSink.end(SortedOps.java:357)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:510)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596)
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:772)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:325)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350)
	at io.github.adamw7.testing.UnitTesting.main(UnitTesting.java:31)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)
Caused by: java.net.ConnectException
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:573)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:123)
	at dev.langchain4j.http.client.jdk.JdkHttpClient.execute(JdkHttpClient.java:50)
	... 71 more
Caused by: java.net.ConnectException
	at java.net.http/jdk.internal.net.http.common.Utils.toConnectException(Utils.java:1055)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.connectAsync(PlainHttpConnection.java:198)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.checkRetryConnect(PlainHttpConnection.java:230)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.lambda$connectAsync$1(PlainHttpConnection.java:206)
	at java.base/java.util.concurrent.CompletableFuture.uniHandle(CompletableFuture.java:934)
	at java.base/java.util.concurrent.CompletableFuture$UniHandle.tryFire(CompletableFuture.java:911)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1773)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: java.nio.channels.ClosedChannelException
	at java.base/sun.nio.ch.SocketChannelImpl.ensureOpen(SocketChannelImpl.java:195)
	at java.base/sun.nio.ch.SocketChannelImpl.beginConnect(SocketChannelImpl.java:760)
	at java.base/sun.nio.ch.SocketChannelImpl.connect(SocketChannelImpl.java:848)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.lambda$connectAsync$0(PlainHttpConnection.java:183)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:569)
	at java.net.http/jdk.internal.net.http.PlainHttpConnection.connectAsync(PlainHttpConnection.java:185)
	... 9 more
2025-08-02 12:10:56.220 WARN [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:115)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Failed to generate code
2025-08-02 12:10:56.221 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Done
2025-08-02 12:10:56.221 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Generated code:

2025-08-02 12:10:56.222 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Refining code...
2025-08-02 12:10:56.223 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.jarvis.springbootkafka.service.KafkaProducerServiceGeneratedAiTests.java}] - Done
*/
