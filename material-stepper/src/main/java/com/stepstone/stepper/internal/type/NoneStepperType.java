package com.stepstone.stepper.internal.type;

/**
 * Created by Huzaifa on 2/13/18.
 */

import com.stepstone.stepper.StepperLayout;

/**
 * Created by yccheok on 29/6/2017.
 */

public class NoneStepperType extends AbstractStepperType {
    public NoneStepperType(StepperLayout stepperLayout) {
        super(stepperLayout);
    }

    @Override
    public void onStepSelected(int newStepPosition, boolean userTriggeredChange) {
    }
}