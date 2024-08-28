package com.example.springhelloworld.controller.half_plus_two_controller;

import com.google.protobuf.Int64Value;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tensorflow.framework.DataType;
import org.tensorflow.framework.TensorProto;
import org.tensorflow.framework.TensorShapeProto;
import tensorflow.serving.PredictionServiceGrpc;
import tensorflow.serving.Predict;
import tensorflow.serving.Model;

@RestController
@RequestMapping("/half_plus_two/grpc")
public class GrpcFire {
    String host = "127.0.0.1";
    int port = 8500;

    String modelName = "zxj_half_plus_two";
    //long modelVersion = 123;

    @RequestMapping("fire")
    public String fire() {

        System.out.println("step 1: init the channel begin...");
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext()
                .build();
        System.out.println("step 1: init the channel successfully");

        System.out.println("step 2: init the stub begin...");
        PredictionServiceGrpc.PredictionServiceBlockingStub stub = PredictionServiceGrpc.newBlockingStub(channel);
        System.out.println("step 2: init the stub successfully");

        System.out.println("step 3: init the predict request begin...");
        // create PredictRequest
        Predict.PredictRequest.Builder requestBuilder = Predict.PredictRequest.newBuilder();
        System.out.println("step 3: init the predict request successfully");

        System.out.println("step 4: init the model begin...");
        // create ModelSpec
        Model.ModelSpec.Builder modelSpecBuilder = Model.ModelSpec.newBuilder();
        modelSpecBuilder.setName(modelName);
        //modelSpecBuilder.setVersion(Int64Value.of(modelVersion));
        modelSpecBuilder.setSignatureName("serving_default");
        System.out.println("step 4: init the model successfully");

        System.out.println("step 5: set the model into request begin...");
        // set model for request
        requestBuilder.setModelSpec(modelSpecBuilder);
        System.out.println("step 5: set the model into request successfully");

        System.out.println("step 6: init the tensor proto begin...");
        // create TensorProto with 3 floats
        TensorProto.Builder tensorProtoBuilder = TensorProto.newBuilder();
        tensorProtoBuilder.setDtype(DataType.DT_FLOAT);
        tensorProtoBuilder.addFloatVal(1.0f);
        tensorProtoBuilder.addFloatVal(2.0f);
        tensorProtoBuilder.addFloatVal(5.0f);
        System.out.println("step 6: init the tensor proto successfully");

        System.out.println("step 7: init the tensor shape proto begin...");
        // create TensorShapeProto
        TensorShapeProto.Builder tensorShapeBuilder = TensorShapeProto.newBuilder();
        tensorShapeBuilder.addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(3));
        System.out.println("step 7: init the tensor shape proto successfully");


        System.out.println("step 8: set the shape for proto begin...");
        // set shape for proto
        tensorProtoBuilder.setTensorShape(tensorShapeBuilder.build());
        System.out.println("step 8: set the shape for proto successfully");

        System.out.println("step 9: init the proto begin...");
        // build proto
        TensorProto proto = tensorProtoBuilder.build();
        System.out.println("step 9: init the proto successfully");

        System.out.println("step 10: init the request x begin...");
        // set proto for request
        requestBuilder.putInputs("x", proto);
        System.out.println("step 10: init the request x successfully");

        System.out.println("step 11: build the request begin...");
        // build request
        Predict.PredictRequest.Builder builder = Predict.PredictRequest.newBuilder();
        System.out.println("haha111");
        builder.setModelSpec(modelSpecBuilder);
        System.out.println("haha222");
        builder.putInputs("inputs", proto);
        System.out.println("haha333");
        Predict.PredictRequest request = builder.build();

        System.out.println("Printing request \n" + request.toString());
        System.out.println("step 11: build the request successfully");

        System.out.println("step 12: init the predict begin...");
        // run predict
        Predict.PredictResponse response = stub.predict(request);
        System.out.println(response.toString());
        System.out.println("step 12: fire the predict successfully");

        return "all done!";
    }

}
