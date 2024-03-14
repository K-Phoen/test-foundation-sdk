// Code generated - EDITING IS FUTILE. DO NOT EDIT.

export enum TestDataQueryType {
	RandomWalk = "random_walk",
	SlowQuery = "slow_query",
	RandomWalkWithError = "random_walk_with_error",
	RandomWalkTable = "random_walk_table",
	ExponentialHeatmapBucketData = "exponential_heatmap_bucket_data",
	LinearHeatmapBucketData = "linear_heatmap_bucket_data",
	NoDataPoints = "no_data_points",
	DataPointsOutsideRange = "datapoints_outside_range",
	CSVMetricValues = "csv_metric_values",
	PredictablePulse = "predictable_pulse",
	PredictableCSVWave = "predictable_csv_wave",
	StreamingClient = "streaming_client",
	Simulation = "simulation",
	USA = "usa",
	Live = "live",
	GrafanaAPI = "grafana_api",
	Arrow = "arrow",
	Annotations = "annotations",
	TableStatic = "table_static",
	ServerError500 = "server_error_500",
	Logs = "logs",
	NodeGraph = "node_graph",
	FlameGraph = "flame_graph",
	RawFrame = "raw_frame",
	CSVFile = "csv_file",
	CSVContent = "csv_content",
	Trace = "trace",
	ManualEntry = "manual_entry",
	VariablesQuery = "variables-query",
}

export const defaultTestDataQueryType = (): TestDataQueryType => (TestDataQueryType.RandomWalk);

export interface StreamingQuery {
	type: "signal" | "logs" | "fetch" | "traces";
	speed: number;
	spread: number;
	noise: number;
	bands?: number;
	url?: string;
}

export const defaultStreamingQuery = (): StreamingQuery => ({
	type: "signal",
	speed: 0,
	spread: 0,
	noise: 0,
});

export interface PulseWaveQuery {
	timeStep?: number;
	onCount?: number;
	offCount?: number;
	onValue?: number;
	offValue?: number;
}

export const defaultPulseWaveQuery = (): PulseWaveQuery => ({
});

export interface SimulationQuery {
	key: Key;
	config?: any;
	stream?: boolean;
	last?: boolean;
}

export const defaultSimulationQuery = (): SimulationQuery => ({
	key: defaultKey(),
});

export interface NodesQuery {
	type?: "random" | "response_small" | "response_medium" | "random edges";
	count?: number;
	seed?: number;
}

export const defaultNodesQuery = (): NodesQuery => ({
});

export interface USAQuery {
	mode?: string;
	period?: string;
	fields?: string[];
	states?: string[];
}

export const defaultUSAQuery = (): USAQuery => ({
});

export interface CSVWave {
	timeStep?: number;
	name?: string;
	valuesCSV?: string;
	labels?: string;
}

export const defaultCSVWave = (): CSVWave => ({
});

// TODO: Should this live here given it's not used in the dataquery?
export interface Scenario {
	id: string;
	name: string;
	stringInput: string;
	description?: string;
	hideAliasField?: boolean;
}

export const defaultScenario = (): Scenario => ({
	id: "",
	name: "",
	stringInput: "",
});

export interface dataquery {
	alias?: string;
	scenarioId?: TestDataQueryType;
	stringInput?: string;
	stream?: StreamingQuery;
	pulseWave?: PulseWaveQuery;
	sim?: SimulationQuery;
	csvWave?: CSVWave[];
	labels?: string;
	lines?: number;
	levelColumn?: boolean;
	channel?: string;
	nodes?: NodesQuery;
	csvFileName?: string;
	csvContent?: string;
	rawFrameContent?: string;
	seriesCount?: number;
	usa?: USAQuery;
	errorType?: "server_panic" | "frontend_exception" | "frontend_observable";
	spanCount?: number;
	points?: (string | number)[][];
	dropPercent?: number;
	flamegraphDiff?: boolean;
	refId?: string;
	hide?: boolean;
	queryType?: string;
	datasource?: any;
	_implementsDataqueryVariant(): void;
}

export const defaultDataquery = (): dataquery => ({
	scenarioId: TestDataQueryType.RandomWalk,
	_implementsDataqueryVariant: () => {},
});

export interface Key {
	type: string;
	tick: number;
	uid?: string;
}

export const defaultKey = (): Key => ({
	type: "",
	tick: 0,
});
