package com.nveladio.notificacao.config;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sns.SnsClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonSnsConfiguration {

    @Value("${aws.accessKey}")
    private String accessKey;

    @Value("${aws.secretKey}")
    private String secretKey;

    @Bean
    public AwsBasicCredentials awsBasicCredentials() {
        return AwsBasicCredentials.create(accessKey, secretKey);
    }

    @Bean
    public SnsClient snsClient() {
        return SnsClient.builder()
                .credentialsProvider(StaticCredentialsProvider.create(awsBasicCredentials()))
                .region(Region.US_EAST_1)
                .build();
    }


}
