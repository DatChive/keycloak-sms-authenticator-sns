package six.six.aws.snsclient;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;

/**
 * Created by DatChive on 04/04/2018
 */
public class SnsClientFactory {
    private static AmazonSNS snsClient = null;

    public static AmazonSNS getSnsClient(String clientToken, String clientSecret) {
        return snsClient == null ?
                AmazonSNSClient.builder()
                        .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(clientToken, clientSecret)))
                        .withRegion("us-west-1")
                        .build() :
                snsClient;
    }
}
