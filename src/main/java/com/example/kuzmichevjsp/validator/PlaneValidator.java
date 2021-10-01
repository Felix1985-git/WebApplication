package com.example.kuzmichevjsp.validator;

import com.example.kuzmichevjsp.dto.PlaneDto;
import com.example.kuzmichevjsp.exception.NullFieldException;

public class PlaneValidator {

    public static void validatePlane(PlaneDto plane) {

        if (plane.getBrand() == null) {
            throw new NullFieldException("brand");
        }

        if (plane.getModel() == null) {
            throw new NullFieldException("model");
        }

        if (plane.getCapacity() <= 0) {
            throw new NullFieldException("capacity");
        }

        if (plane.getTale_number() == null) {
            throw new NullFieldException("taleNumber");
        }

    }
}