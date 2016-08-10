package com.example.test;

import java.util.List;

/**
 * Created by Administrator on 2016/8/2 0002.
 */
public class Test {

    /**
     * state : 00
     * monitor_id : 201411001
     * monitor_name : 1
     * dispatchtime :
     * monitorstate :
     * monitordes :
     * data : [{"turbidity":[{"turbidity":"23424","turbidity_time":"20160708 12:00:00"},{"turbidity":"356456","turbidity_time":"20160708 11:00:10"}],"chlorinedioxide":[{"chlorinedioxide ":"23424","chlorinedioxide_time":"20160708 12:00:00"},{"chlorinedioxide ":"899489","chlorinedioxide_time":"20160710 12:00:00"}]}]
     */

    private String state;
    private String monitor_id;
    private String monitor_name;
    private String dispatchtime;
    private String monitorstate;
    private String monitordes;
    private List<DataBean> data;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMonitor_id() {
        return monitor_id;
    }

    public void setMonitor_id(String monitor_id) {
        this.monitor_id = monitor_id;
    }

    public String getMonitor_name() {
        return monitor_name;
    }

    public void setMonitor_name(String monitor_name) {
        this.monitor_name = monitor_name;
    }

    public String getDispatchtime() {
        return dispatchtime;
    }

    public void setDispatchtime(String dispatchtime) {
        this.dispatchtime = dispatchtime;
    }

    public String getMonitorstate() {
        return monitorstate;
    }

    public void setMonitorstate(String monitorstate) {
        this.monitorstate = monitorstate;
    }

    public String getMonitordes() {
        return monitordes;
    }

    public void setMonitordes(String monitordes) {
        this.monitordes = monitordes;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * turbidity : 23424
         * turbidity_time : 20160708 12:00:00
         */

        private List<TurbidityBean> turbidity;
        /**
         * chlorinedioxide  : 23424
         * chlorinedioxide_time : 20160708 12:00:00
         */

        private List<ChlorinedioxideBean> chlorinedioxide;

        public List<TurbidityBean> getTurbidity() {
            return turbidity;
        }

        public void setTurbidity(List<TurbidityBean> turbidity) {
            this.turbidity = turbidity;
        }

        public List<ChlorinedioxideBean> getChlorinedioxide() {
            return chlorinedioxide;
        }

        public void setChlorinedioxide(List<ChlorinedioxideBean> chlorinedioxide) {
            this.chlorinedioxide = chlorinedioxide;
        }

        public static class TurbidityBean {
            private String turbidity;
            private String turbidity_time;

            public String getTurbidity() {
                return turbidity;
            }

            public void setTurbidity(String turbidity) {
                this.turbidity = turbidity;
            }

            public String getTurbidity_time() {
                return turbidity_time;
            }

            public void setTurbidity_time(String turbidity_time) {
                this.turbidity_time = turbidity_time;
            }
        }

        public static class ChlorinedioxideBean {
            private String chlorinedioxide;
            private String chlorinedioxide_time;

            public String getChlorinedioxide() {
                return chlorinedioxide;
            }

            public void setChlorinedioxide(String chlorinedioxide) {
                this.chlorinedioxide = chlorinedioxide;
            }

            public String getChlorinedioxide_time() {
                return chlorinedioxide_time;
            }

            public void setChlorinedioxide_time(String chlorinedioxide_time) {
                this.chlorinedioxide_time = chlorinedioxide_time;
            }
        }
    }
}
