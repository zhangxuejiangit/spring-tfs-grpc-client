package com.example.springgrpcclient.controller.half_plus_two_controller;

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


@RestController
@RequestMapping("/half_plus_two/grpc")
public class HPTGrpcFire {
    String host = "localhost";
    int port = 8500;

    String modelName = "zxj_half_plus_two";
    //long modelVersion = 123;

    private ManagedChannel channel;

    private PredictionServiceGrpc.PredictionServiceBlockingStub stub;

    private Model.ModelSpec.Builder modelSpecBuilder;

    public HPTGrpcFire() {
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
    }

    @RequestMapping("fire")
    public String fire() {
        System.out.println("step 1: init the tensor proto begin...");
        // create TensorProto with 3 floats
        TensorProto.Builder tensorProtoBuilder = TensorProto.newBuilder();
        tensorProtoBuilder.setDtype(DataType.DT_FLOAT);
        tensorProtoBuilder.addFloatVal(1.0f);
        tensorProtoBuilder.addFloatVal(2.0f);
        tensorProtoBuilder.addFloatVal(5.0f);
        System.out.println("step 1: init the tensor proto successfully");

        System.out.println("step 2: init the tensor shape proto begin...");
        // create TensorShapeProto
        TensorShapeProto.Builder tensorShapeBuilder = TensorShapeProto.newBuilder();
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
                .putInputs("x", tensorProtoBuilder.build())
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
