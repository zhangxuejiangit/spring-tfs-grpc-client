package com.example.springhelloworld.controller.half_plus_two_controller;

import com.google.protobuf.Int64Value;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tensorflow.framework.DataType;
import tensorflow.serving.PredictionServiceGrpc;
import tensorflow.serving.Predict;
import tensorflow.serving.Model;
import org.tensorflow.framework.TensorProto;
import org.tensorflow.framework.TensorShapeProto;


@RestController
@RequestMapping("/half_plus_two/grpc")
public class GrpcFire {
    String host = "http://localhost";
    int port = 8500;

    String modelName = "zxj_half_plus_two";
    long modelVersion = 123;
    String url = "v1/models/zxj_half_plus_two:predict";
    String body = "{\"instances\": [1.0, 2.0, 5.0]}";

    private ManagedChannel channel;
    private PredictionServiceGrpc.PredictionServiceBlockingStub stub;


    public GrpcFire() {
        channel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext()
                .build();
        stub = PredictionServiceGrpc.newBlockingStub(channel);
    }

    @RequestMapping("fire")
    public String fire() {

        // create PredictRequest
        Predict.PredictRequest.Builder requestBuilder = Predict.PredictRequest.newBuilder();

        // create ModelSpec
        Model.ModelSpec.Builder modelSpecBuilder = Model.ModelSpec.newBuilder();
        modelSpecBuilder.setName(modelName);
        modelSpecBuilder.setVersion(Int64Value.of(modelVersion));
        modelSpecBuilder.setSignatureName("serving_default");

        // set model for request
        requestBuilder.setModelSpec(modelSpecBuilder);

        // create TensorProto with 3 floats
        TensorProto.Builder tensorProtoBuilder = TensorProto.newBuilder();
        tensorProtoBuilder.setDtype(DataType.DT_FLOAT);
        tensorProtoBuilder.addFloatVal(1.0f);
        tensorProtoBuilder.addFloatVal(2.0f);
        tensorProtoBuilder.addFloatVal(5.0f);

        // create TensorShapeProto
        TensorShapeProto.Builder tensorShapeBuilder = TensorShapeProto.newBuilder();
        tensorShapeBuilder.addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(3));

        // set shape for proto
        tensorProtoBuilder.setTensorShape(tensorShapeBuilder.build());

        // build proto
        TensorProto proto = tensorProtoBuilder.build();

        // set proto for request
        requestBuilder.putInputs("x", proto);

        // build request
        Predict.PredictRequest request = requestBuilder.build();
        System.out.println("Printing request \n" + request.toString());

        // run predict
        Predict.PredictResponse response = stub.predict(request);
        System.out.println(response.toString());

        return "";
    }

}
