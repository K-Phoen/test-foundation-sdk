<?php

namespace Grafana\Foundation\Alerting;

final class TimeIntervalConverter
{
    public static function convert(\Grafana\Foundation\Alerting\TimeInterval $input): string
    {
        
        $calls = [
            '(new \Grafana\Foundation\Alerting\TimeIntervalBuilder())',
        ];
            if ($input->name !== null && $input->name !== "") {
    
        
    $buffer = 'name(';
        $arg0 =\var_export($input->name, true);
        $buffer .= $arg0;
        
    $buffer .= ')';

    $calls[] = $buffer;
    
    
    }
            if ($input->timeIntervals !== null && count($input->timeIntervals) >= 1) {
    
        
    $buffer = 'timeIntervals(';
        $tmparg0 = [];
        foreach ($input->timeIntervals as $arg1) {
        $tmptime_intervalsarg1 = \Grafana\Foundation\Alerting\TimeIntervalItemConverter::convert($arg1);
        $tmparg0[] = $tmptime_intervalsarg1;
        }
        $arg0 = "[" . implode(", \n", $tmparg0) . "]";
        $buffer .= $arg0;
        
    $buffer .= ')';

    $calls[] = $buffer;
    
    
    }

        return \implode("\n\t->", $calls);
    }
}
