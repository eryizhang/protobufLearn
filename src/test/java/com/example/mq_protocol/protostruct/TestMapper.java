package com.example.mq_protocol.protostruct;


import com.google.protobuf.ByteString;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ByteString.class, BaseMapper.class}, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface TestMapper {
    TestMapper instance= Mappers.getMapper(TestMapper.class);
    //TestOuterClass toProto(TestDTO testDTO);

    TestDTO toDTO(TestOuterClass test);
}