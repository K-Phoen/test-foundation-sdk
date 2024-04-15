# Code generated - EDITING IS FUTILE. DO NOT EDIT.

import typing
from ..cog import builder as cogbuilder
from ..models import googlecloudmonitoring


class CloudMonitoringQuery(cogbuilder.Builder[googlecloudmonitoring.CloudMonitoringQuery]):    
    __internal: googlecloudmonitoring.CloudMonitoringQuery

    def __init__(self):
        self.__internal = googlecloudmonitoring.CloudMonitoringQuery()

    def build(self) -> googlecloudmonitoring.CloudMonitoringQuery:
        return self.__internal    
    
    def ref_id(self, ref_id: str) -> typing.Self:    
        """
        A unique identifier for the query within the list of targets.
        In server side expressions, the refId is used as a variable name to identify results.
        By default, the UI will assign A->Z; however setting meaningful names may be useful.
        """
            
        self.__internal.ref_id = ref_id
    
        return self
    
    def hide(self, hide: bool) -> typing.Self:    
        """
        true if query is disabled (ie should not be returned to the dashboard)
        Note this does not always imply that the query should not be executed since
        the results from a hidden query may be used as the input to other queries (SSE etc)
        """
            
        self.__internal.hide = hide
    
        return self
    
    def query_type(self, query_type: str) -> typing.Self:    
        """
        Specify the query flavor
        TODO make this required and give it a default
        """
            
        self.__internal.query_type = query_type
    
        return self
    
    def alias_by(self, alias_by: str) -> typing.Self:    
        """
        Aliases can be set to modify the legend labels. e.g. {{metric.label.xxx}}. See docs for more detail.
        """
            
        self.__internal.alias_by = alias_by
    
        return self
    
    def time_series_list(self, time_series_list: cogbuilder.Builder[googlecloudmonitoring.TimeSeriesList]) -> typing.Self:    
        """
        GCM query type.
        queryType: #QueryType
        Time Series List sub-query properties.
        """
            
        time_series_list_resource = time_series_list.build()
        self.__internal.time_series_list = time_series_list_resource
    
        return self
    
    def time_series_query(self, time_series_query: cogbuilder.Builder[googlecloudmonitoring.TimeSeriesQuery]) -> typing.Self:    
        """
        Time Series sub-query properties.
        """
            
        time_series_query_resource = time_series_query.build()
        self.__internal.time_series_query = time_series_query_resource
    
        return self
    
    def slo_query(self, slo_query: cogbuilder.Builder[googlecloudmonitoring.SLOQuery]) -> typing.Self:    
        """
        SLO sub-query properties.
        """
            
        slo_query_resource = slo_query.build()
        self.__internal.slo_query = slo_query_resource
    
        return self
    
    def datasource(self, datasource: object) -> typing.Self:    
        """
        For mixed data sources the selected datasource is on the query level.
        For non mixed scenarios this is undefined.
        TODO find a better way to do this ^ that's friendly to schema
        TODO this shouldn't be unknown but DataSourceRef | null
        """
            
        self.__internal.datasource = datasource
    
        return self
    
    def interval_ms(self, interval_ms: float) -> typing.Self:    
        """
        Time interval in milliseconds.
        """
            
        self.__internal.interval_ms = interval_ms
    
        return self
    

class TimeSeriesList(cogbuilder.Builder[googlecloudmonitoring.TimeSeriesList]):    
    """
    Time Series List sub-query properties.
    """
    
    __internal: googlecloudmonitoring.TimeSeriesList

    def __init__(self):
        self.__internal = googlecloudmonitoring.TimeSeriesList()

    def build(self) -> googlecloudmonitoring.TimeSeriesList:
        return self.__internal    
    
    def project_name(self, project_name: str) -> typing.Self:    
        """
        GCP project to execute the query against.
        """
            
        self.__internal.project_name = project_name
    
        return self
    
    def cross_series_reducer(self, cross_series_reducer: str) -> typing.Self:    
        """
        Reducer applied across a set of time-series values. Defaults to REDUCE_NONE.
        """
            
        self.__internal.cross_series_reducer = cross_series_reducer
    
        return self
    
    def alignment_period(self, alignment_period: str) -> typing.Self:    
        """
        Alignment period to use when regularizing data. Defaults to cloud-monitoring-auto.
        """
            
        self.__internal.alignment_period = alignment_period
    
        return self
    
    def per_series_aligner(self, per_series_aligner: str) -> typing.Self:    
        """
        Alignment function to be used. Defaults to ALIGN_MEAN.
        """
            
        self.__internal.per_series_aligner = per_series_aligner
    
        return self
    
    def group_bys(self, group_bys: list[str]) -> typing.Self:    
        """
        Array of labels to group data by.
        """
            
        self.__internal.group_bys = group_bys
    
        return self
    
    def filters(self, filters: list[str]) -> typing.Self:    
        """
        Array of filters to query data by. Labels that can be filtered on are defined by the metric.
        """
            
        self.__internal.filters = filters
    
        return self
    
    def view(self, view: str) -> typing.Self:    
        """
        Data view, defaults to FULL.
        """
            
        self.__internal.view = view
    
        return self
    
    def secondary_cross_series_reducer(self, secondary_cross_series_reducer: str) -> typing.Self:    
        """
        Only present if a preprocessor is selected. Reducer applied across a set of time-series values. Defaults to REDUCE_NONE.
        """
            
        self.__internal.secondary_cross_series_reducer = secondary_cross_series_reducer
    
        return self
    
    def secondary_alignment_period(self, secondary_alignment_period: str) -> typing.Self:    
        """
        Only present if a preprocessor is selected. Alignment period to use when regularizing data. Defaults to cloud-monitoring-auto.
        """
            
        self.__internal.secondary_alignment_period = secondary_alignment_period
    
        return self
    
    def secondary_per_series_aligner(self, secondary_per_series_aligner: str) -> typing.Self:    
        """
        Only present if a preprocessor is selected. Alignment function to be used. Defaults to ALIGN_MEAN.
        """
            
        self.__internal.secondary_per_series_aligner = secondary_per_series_aligner
    
        return self
    
    def secondary_group_bys(self, secondary_group_bys: list[str]) -> typing.Self:    
        """
        Only present if a preprocessor is selected. Array of labels to group data by.
        """
            
        self.__internal.secondary_group_bys = secondary_group_bys
    
        return self
    
    def preprocessor(self, preprocessor: googlecloudmonitoring.PreprocessorType) -> typing.Self:    
        """
        Preprocessor is not part of the API, but is used to store the preprocessor and not affect the UI for the rest of parameters
        """
            
        self.__internal.preprocessor = preprocessor
    
        return self
    
    def title(self, title: str) -> typing.Self:    
        """
        Annotation title.
        """
            
        self.__internal.title = title
    
        return self
    
    def text(self, text: str) -> typing.Self:    
        """
        Annotation text.
        """
            
        self.__internal.text = text
    
        return self
    

class AnnotationQuery(cogbuilder.Builder[googlecloudmonitoring.AnnotationQuery]):    
    """
    Annotation sub-query properties.
    """
    
    __internal: googlecloudmonitoring.AnnotationQuery

    def __init__(self):
        self.__internal = googlecloudmonitoring.AnnotationQuery()

    def build(self) -> googlecloudmonitoring.AnnotationQuery:
        return self.__internal    
    
    def project_name(self, project_name: str) -> typing.Self:    
        """
        GCP project to execute the query against.
        """
            
        self.__internal.project_name = project_name
    
        return self
    
    def cross_series_reducer(self, cross_series_reducer: str) -> typing.Self:    
        """
        Reducer applied across a set of time-series values. Defaults to REDUCE_NONE.
        """
            
        self.__internal.cross_series_reducer = cross_series_reducer
    
        return self
    
    def alignment_period(self, alignment_period: str) -> typing.Self:    
        """
        Alignment period to use when regularizing data. Defaults to cloud-monitoring-auto.
        """
            
        self.__internal.alignment_period = alignment_period
    
        return self
    
    def per_series_aligner(self, per_series_aligner: str) -> typing.Self:    
        """
        Alignment function to be used. Defaults to ALIGN_MEAN.
        """
            
        self.__internal.per_series_aligner = per_series_aligner
    
        return self
    
    def group_bys(self, group_bys: list[str]) -> typing.Self:    
        """
        Array of labels to group data by.
        """
            
        self.__internal.group_bys = group_bys
    
        return self
    
    def filters(self, filters: list[str]) -> typing.Self:    
        """
        Array of filters to query data by. Labels that can be filtered on are defined by the metric.
        """
            
        self.__internal.filters = filters
    
        return self
    
    def view(self, view: str) -> typing.Self:    
        """
        Data view, defaults to FULL.
        """
            
        self.__internal.view = view
    
        return self
    
    def secondary_cross_series_reducer(self, secondary_cross_series_reducer: str) -> typing.Self:    
        """
        Only present if a preprocessor is selected. Reducer applied across a set of time-series values. Defaults to REDUCE_NONE.
        """
            
        self.__internal.secondary_cross_series_reducer = secondary_cross_series_reducer
    
        return self
    
    def secondary_alignment_period(self, secondary_alignment_period: str) -> typing.Self:    
        """
        Only present if a preprocessor is selected. Alignment period to use when regularizing data. Defaults to cloud-monitoring-auto.
        """
            
        self.__internal.secondary_alignment_period = secondary_alignment_period
    
        return self
    
    def secondary_per_series_aligner(self, secondary_per_series_aligner: str) -> typing.Self:    
        """
        Only present if a preprocessor is selected. Alignment function to be used. Defaults to ALIGN_MEAN.
        """
            
        self.__internal.secondary_per_series_aligner = secondary_per_series_aligner
    
        return self
    
    def secondary_group_bys(self, secondary_group_bys: list[str]) -> typing.Self:    
        """
        Only present if a preprocessor is selected. Array of labels to group data by.
        """
            
        self.__internal.secondary_group_bys = secondary_group_bys
    
        return self
    
    def title(self, title: str) -> typing.Self:    
        """
        Annotation title.
        """
            
        self.__internal.title = title
    
        return self
    
    def preprocessor(self, preprocessor: googlecloudmonitoring.PreprocessorType) -> typing.Self:    
        """
        Preprocessor is not part of the API, but is used to store the preprocessor and not affect the UI for the rest of parameters
        """
            
        self.__internal.preprocessor = preprocessor
    
        return self
    
    def text(self, text: str) -> typing.Self:    
        """
        Annotation text.
        """
            
        self.__internal.text = text
    
        return self
    

class TimeSeriesQuery(cogbuilder.Builder[googlecloudmonitoring.TimeSeriesQuery]):    
    """
    Time Series sub-query properties.
    """
    
    __internal: googlecloudmonitoring.TimeSeriesQuery

    def __init__(self):
        self.__internal = googlecloudmonitoring.TimeSeriesQuery()

    def build(self) -> googlecloudmonitoring.TimeSeriesQuery:
        return self.__internal    
    
    def project_name(self, project_name: str) -> typing.Self:    
        """
        GCP project to execute the query against.
        """
            
        self.__internal.project_name = project_name
    
        return self
    
    def query(self, query: str) -> typing.Self:    
        """
        MQL query to be executed.
        """
            
        self.__internal.query = query
    
        return self
    
    def graph_period(self, graph_period: typing.Union[typing.Literal["disabled"]]) -> typing.Self:    
        """
        To disable the graphPeriod, it should explictly be set to 'disabled'.
        """
            
        self.__internal.graph_period = graph_period
    
        return self
    

class SLOQuery(cogbuilder.Builder[googlecloudmonitoring.SLOQuery]):    
    """
    SLO sub-query properties.
    """
    
    __internal: googlecloudmonitoring.SLOQuery

    def __init__(self):
        self.__internal = googlecloudmonitoring.SLOQuery()

    def build(self) -> googlecloudmonitoring.SLOQuery:
        return self.__internal    
    
    def project_name(self, project_name: str) -> typing.Self:    
        """
        GCP project to execute the query against.
        """
            
        self.__internal.project_name = project_name
    
        return self
    
    def per_series_aligner(self, per_series_aligner: str) -> typing.Self:    
        """
        Alignment function to be used. Defaults to ALIGN_MEAN.
        """
            
        self.__internal.per_series_aligner = per_series_aligner
    
        return self
    
    def alignment_period(self, alignment_period: str) -> typing.Self:    
        """
        Alignment period to use when regularizing data. Defaults to cloud-monitoring-auto.
        """
            
        self.__internal.alignment_period = alignment_period
    
        return self
    
    def selector_name(self, selector_name: str) -> typing.Self:    
        """
        SLO selector.
        """
            
        self.__internal.selector_name = selector_name
    
        return self
    
    def service_id(self, service_id: str) -> typing.Self:    
        """
        ID for the service the SLO is in.
        """
            
        self.__internal.service_id = service_id
    
        return self
    
    def service_name(self, service_name: str) -> typing.Self:    
        """
        Name for the service the SLO is in.
        """
            
        self.__internal.service_name = service_name
    
        return self
    
    def slo_id(self, slo_id: str) -> typing.Self:    
        """
        ID for the SLO.
        """
            
        self.__internal.slo_id = slo_id
    
        return self
    
    def slo_name(self, slo_name: str) -> typing.Self:    
        """
        Name of the SLO.
        """
            
        self.__internal.slo_name = slo_name
    
        return self
    
    def goal(self, goal: float) -> typing.Self:    
        """
        SLO goal value.
        """
            
        self.__internal.goal = goal
    
        return self
    
    def lookback_period(self, lookback_period: str) -> typing.Self:    
        """
        Specific lookback period for the SLO.
        """
            
        self.__internal.lookback_period = lookback_period
    
        return self
    

class MetricQuery(cogbuilder.Builder[googlecloudmonitoring.MetricQuery]):    
    """
    @deprecated This type is for migration purposes only. Replaced by TimeSeriesList Metric sub-query properties.
    """
    
    __internal: googlecloudmonitoring.MetricQuery

    def __init__(self):
        self.__internal = googlecloudmonitoring.MetricQuery()

    def build(self) -> googlecloudmonitoring.MetricQuery:
        return self.__internal    
    
    def project_name(self, project_name: str) -> typing.Self:    
        """
        GCP project to execute the query against.
        """
            
        self.__internal.project_name = project_name
    
        return self
    
    def per_series_aligner(self, per_series_aligner: str) -> typing.Self:    
        """
        Alignment function to be used. Defaults to ALIGN_MEAN.
        """
            
        self.__internal.per_series_aligner = per_series_aligner
    
        return self
    
    def alignment_period(self, alignment_period: str) -> typing.Self:    
        """
        Alignment period to use when regularizing data. Defaults to cloud-monitoring-auto.
        """
            
        self.__internal.alignment_period = alignment_period
    
        return self
    
    def alias_by(self, alias_by: str) -> typing.Self:    
        """
        Aliases can be set to modify the legend labels. e.g. {{metric.label.xxx}}. See docs for more detail.
        """
            
        self.__internal.alias_by = alias_by
    
        return self
    
    def editor_mode(self, editor_mode: str) -> typing.Self:        
        self.__internal.editor_mode = editor_mode
    
        return self
    
    def metric_type(self, metric_type: str) -> typing.Self:        
        self.__internal.metric_type = metric_type
    
        return self
    
    def cross_series_reducer(self, cross_series_reducer: str) -> typing.Self:    
        """
        Reducer applied across a set of time-series values. Defaults to REDUCE_NONE.
        """
            
        self.__internal.cross_series_reducer = cross_series_reducer
    
        return self
    
    def group_bys(self, group_bys: list[str]) -> typing.Self:    
        """
        Array of labels to group data by.
        """
            
        self.__internal.group_bys = group_bys
    
        return self
    
    def filters(self, filters: list[str]) -> typing.Self:    
        """
        Array of filters to query data by. Labels that can be filtered on are defined by the metric.
        """
            
        self.__internal.filters = filters
    
        return self
    
    def metric_kind(self, metric_kind: googlecloudmonitoring.MetricKind) -> typing.Self:        
        self.__internal.metric_kind = metric_kind
    
        return self
    
    def value_type(self, value_type: str) -> typing.Self:        
        self.__internal.value_type = value_type
    
        return self
    
    def view(self, view: str) -> typing.Self:        
        self.__internal.view = view
    
        return self
    
    def query(self, query: str) -> typing.Self:    
        """
        MQL query to be executed.
        """
            
        self.__internal.query = query
    
        return self
    
    def preprocessor(self, preprocessor: googlecloudmonitoring.PreprocessorType) -> typing.Self:    
        """
        Preprocessor is not part of the API, but is used to store the preprocessor and not affect the UI for the rest of parameters
        """
            
        self.__internal.preprocessor = preprocessor
    
        return self
    
    def graph_period(self, graph_period: typing.Union[typing.Literal["disabled"]]) -> typing.Self:    
        """
        To disable the graphPeriod, it should explictly be set to 'disabled'.
        """
            
        self.__internal.graph_period = graph_period
    
        return self
    

class LegacyCloudMonitoringAnnotationQuery(cogbuilder.Builder[googlecloudmonitoring.LegacyCloudMonitoringAnnotationQuery]):    
    """
    @deprecated Use AnnotationQuery instead. Legacy annotation query properties for migration purposes.
    """
    
    __internal: googlecloudmonitoring.LegacyCloudMonitoringAnnotationQuery

    def __init__(self):
        self.__internal = googlecloudmonitoring.LegacyCloudMonitoringAnnotationQuery()

    def build(self) -> googlecloudmonitoring.LegacyCloudMonitoringAnnotationQuery:
        return self.__internal    
    
    def project_name(self, project_name: str) -> typing.Self:    
        """
        GCP project to execute the query against.
        """
            
        self.__internal.project_name = project_name
    
        return self
    
    def metric_type(self, metric_type: str) -> typing.Self:        
        self.__internal.metric_type = metric_type
    
        return self
    
    def ref_id(self, ref_id: str) -> typing.Self:    
        """
        Query refId.
        """
            
        self.__internal.ref_id = ref_id
    
        return self
    
    def filters(self, filters: list[str]) -> typing.Self:    
        """
        Array of filters to query data by. Labels that can be filtered on are defined by the metric.
        """
            
        self.__internal.filters = filters
    
        return self
    
    def metric_kind(self, metric_kind: googlecloudmonitoring.MetricKind) -> typing.Self:        
        self.__internal.metric_kind = metric_kind
    
        return self
    
    def value_type(self, value_type: str) -> typing.Self:        
        self.__internal.value_type = value_type
    
        return self
    
    def title(self, title: str) -> typing.Self:    
        """
        Annotation title.
        """
            
        self.__internal.title = title
    
        return self
    
    def text(self, text: str) -> typing.Self:    
        """
        Annotation text.
        """
            
        self.__internal.text = text
    
        return self
    

class Filter(cogbuilder.Builder[googlecloudmonitoring.Filter]):    
    """
    Query filter representation.
    """
    
    __internal: googlecloudmonitoring.Filter

    def __init__(self):
        self.__internal = googlecloudmonitoring.Filter()

    def build(self) -> googlecloudmonitoring.Filter:
        return self.__internal    
    
    def key(self, key: str) -> typing.Self:    
        """
        Filter key.
        """
            
        self.__internal.key = key
    
        return self
    
    def operator(self, operator: str) -> typing.Self:    
        """
        Filter operator.
        """
            
        self.__internal.operator = operator
    
        return self
    
    def value(self, value: str) -> typing.Self:    
        """
        Filter value.
        """
            
        self.__internal.value = value
    
        return self
    
    def condition(self, condition: str) -> typing.Self:    
        """
        Filter condition.
        """
            
        self.__internal.condition = condition
    
        return self
    