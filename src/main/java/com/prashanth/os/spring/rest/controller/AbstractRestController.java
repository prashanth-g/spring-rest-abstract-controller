package com.prashanth.os.spring.rest.controller;

import java.util.function.Function;

/**
 * Abstract class to do operations on entities
 */
public abstract class AbstractRestController {

    /**
     * Creates the entity
     * @param input
     * @param requestConverter
     * @param crudOperation
     * @return OutputType
     */
    public <InputType,
            OutputType> OutputType create(
            InputType input,
            Function<InputType, InputType> requestConverter,
            Function<InputType, OutputType> crudOperation) {
        return crudOperation.apply(requestConverter.apply(input));
    }

    /**
     * Gets the entity
     * @param input
     * @param requestConverter
     * @param crudOperation
     * @return OutputType
     */
    public  <InputType,
            OutputType> OutputType get(
            InputType input,
            Function<InputType, InputType> requestConverter,
            Function<InputType, OutputType> crudOperation) {
        return crudOperation.apply(requestConverter.apply(input));
    }

    /**
     * Updates the entity
     * @param input
     * @param requestConverter
     * @param crudOperation
     * @return OutputType
     */
    public  <InputType,
            OutputType> OutputType update(
            InputType input,
            Function<InputType, InputType> requestConverter,
            Function<InputType, OutputType> crudOperation) {
        return crudOperation.apply(requestConverter.apply(input));
    }

    /**
     * Delets the entity
     * @param input
     * @param crudOperation
     * @return OutputType
     */
    public  <InputType,
            OutputType> OutputType delete(
            InputType input,
            Function<InputType, OutputType> crudOperation) {
        return crudOperation.apply(input);
    }
}
