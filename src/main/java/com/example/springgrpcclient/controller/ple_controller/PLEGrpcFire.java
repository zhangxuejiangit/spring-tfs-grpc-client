package com.example.springgrpcclient.controller.ple_controller;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tensorflow.framework.DataType;
import org.tensorflow.framework.TensorProto;
import org.tensorflow.framework.TensorShapeProto;
import tensorflow.serving.Model;
import tensorflow.serving.Predict;
import tensorflow.serving.PredictionServiceGrpc;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@RestController
@RequestMapping("/ple/grpc")
public class PLEGrpcFire {
    String host = "localhost";
    int port = 8500;

    String modelName = "ple";
    //long modelVersion = 123;

    private ManagedChannel channel;

    private PredictionServiceGrpc.PredictionServiceBlockingStub stub;

    private Model.ModelSpec.Builder modelSpecBuilder;

    private Map<String, TensorProto> featureMap;

    public PLEGrpcFire() {
        System.out.println("step i1: init the channel begin...");
        channel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext()
                .build();
        System.out.println("step i1: init the channel successfully");

        System.out.println("step i2: init the stub begin...");
        stub = PredictionServiceGrpc.newBlockingStub(channel);
        System.out.println("step i2: init the stub successfully");

        System.out.println("step i3: init the model begin...");
        // create ModelSpec
        modelSpecBuilder = Model.ModelSpec.newBuilder();
        modelSpecBuilder.setName(modelName);
        //modelSpecBuilder.setVersion(Int64Value.of(modelVersion));
        modelSpecBuilder.setSignatureName("serving_default");
        System.out.println("step i3: init the model successfully");

        init_feature_map();
    }

    private void init_feature_map() {
        featureMap = new HashMap<>();
        featureMap.put("avg_playtime_15d", createFloatTensorProto(Arrays.asList(0.0f)));

        System.out.println("step i4: init the feature map successfully");
        System.out.println(featureMap.toString());
    }

    private TensorProto createIntTensorProto(List<Integer> collections) {
        return TensorProto.newBuilder()
                .setDtype(DataType.DT_INT32)
                .addAllIntVal(collections)
                .setTensorShape(
                        TensorShapeProto.newBuilder()
                                .addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(1))
                                .addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(collections.size()))
                                .build()
                )
                .build();
    }

    private TensorProto createFloatTensorProto(List<Float> collections) {
        return TensorProto.newBuilder()
                .setDtype(DataType.DT_FLOAT)
                .addAllFloatVal(collections)
                .setTensorShape(
                        TensorShapeProto.newBuilder()
                                .addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(1))
                                .addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(collections.size()))
                                .build()
                )
                .build();
    }

    @RequestMapping("fire")
    public String fire() {
        System.out.println("step 1: init the tensor proto begin...");
        // create TensorProto with 3 floats
        TensorProto.Builder tensorProtoBuilder = TensorProto.newBuilder();
        tensorProtoBuilder.setDtype(DataType.DT_INT32);
        tensorProtoBuilder.addAllIntVal(Stream.of(1, 1, 1).collect(Collectors.toList()));
        System.out.println("step 1: init the tensor proto successfully");

        System.out.println("step 2: init the tensor shape proto begin...");
        // create TensorShapeProto
        TensorShapeProto.Builder tensorShapeBuilder = TensorShapeProto.newBuilder();
        tensorShapeBuilder.addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(1));
        tensorShapeBuilder.addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(3));
        System.out.println("step 2: init the tensor shape proto successfully");


        System.out.println("step 3: set the shape for proto begin...");
        // set shape for proto
        tensorProtoBuilder.setTensorShape(tensorShapeBuilder.build());
        System.out.println("step 3: set the shape for proto successfully");

        System.out.println("step 4: build the request begin...");
        // build request
        Predict.PredictRequest request = Predict
                .PredictRequest
                .newBuilder()
                .setModelSpec(modelSpecBuilder)
                .putInputs("avg_playtime_15d", tensorProtoBuilder.build())
                .build();

        System.out.println("Printing request \n" + request.toString());
        System.out.println("step 4: build the request successfully");

        System.out.println("step 5: init the predict begin...");
        // run predict
        Predict.PredictResponse response = stub.predict(request);
        System.out.println(response.toString());
        System.out.println("step 5: fire the predict successfully");

        return "all done!";
    }

}
