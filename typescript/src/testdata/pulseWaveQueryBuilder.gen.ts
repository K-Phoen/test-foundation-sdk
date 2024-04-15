// Code generated - EDITING IS FUTILE. DO NOT EDIT.

import * as cog from '../cog';
import * as testdata from '../testdata';

export class PulseWaveQueryBuilder implements cog.Builder<testdata.PulseWaveQuery> {
    private readonly internal: testdata.PulseWaveQuery;

    constructor() {
        this.internal = testdata.defaultPulseWaveQuery();
    }

    build(): testdata.PulseWaveQuery {
        return this.internal;
    }

    timeStep(timeStep: number): this {
        this.internal.timeStep = timeStep;
        return this;
    }

    onCount(onCount: number): this {
        this.internal.onCount = onCount;
        return this;
    }

    offCount(offCount: number): this {
        this.internal.offCount = offCount;
        return this;
    }

    onValue(onValue: number): this {
        this.internal.onValue = onValue;
        return this;
    }

    offValue(offValue: number): this {
        this.internal.offValue = offValue;
        return this;
    }
}