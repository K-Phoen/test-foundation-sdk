// Code generated - EDITING IS FUTILE. DO NOT EDIT.

package expr

import (
	cog "github.com/grafana/grafana-foundation-sdk/go/cog"
)

var _ cog.Builder[ExprTypeThresholdConditionsUnloadEvaluator] = (*ExprTypeThresholdConditionsUnloadEvaluatorBuilder)(nil)

type ExprTypeThresholdConditionsUnloadEvaluatorBuilder struct {
	internal *ExprTypeThresholdConditionsUnloadEvaluator
	errors   map[string]cog.BuildErrors
}

func NewExprTypeThresholdConditionsUnloadEvaluatorBuilder() *ExprTypeThresholdConditionsUnloadEvaluatorBuilder {
	resource := &ExprTypeThresholdConditionsUnloadEvaluator{}
	builder := &ExprTypeThresholdConditionsUnloadEvaluatorBuilder{
		internal: resource,
		errors:   make(map[string]cog.BuildErrors),
	}

	builder.applyDefaults()

	return builder
}

func (builder *ExprTypeThresholdConditionsUnloadEvaluatorBuilder) Build() (ExprTypeThresholdConditionsUnloadEvaluator, error) {
	var errs cog.BuildErrors

	for _, err := range builder.errors {
		errs = append(errs, cog.MakeBuildErrors("ExprTypeThresholdConditionsUnloadEvaluator", err)...)
	}

	if len(errs) != 0 {
		return ExprTypeThresholdConditionsUnloadEvaluator{}, errs
	}

	return *builder.internal, nil
}

func (builder *ExprTypeThresholdConditionsUnloadEvaluatorBuilder) Params(params []float64) *ExprTypeThresholdConditionsUnloadEvaluatorBuilder {
	builder.internal.Params = params

	return builder
}

// e.g. "gt"
func (builder *ExprTypeThresholdConditionsUnloadEvaluatorBuilder) Type(typeArg TypeThresholdType) *ExprTypeThresholdConditionsUnloadEvaluatorBuilder {
	builder.internal.Type = typeArg

	return builder
}

func (builder *ExprTypeThresholdConditionsUnloadEvaluatorBuilder) applyDefaults() {
}