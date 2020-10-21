package appfix.model.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.line.LineChartDataSet;
import org.primefaces.model.charts.line.LineChartModel;
import org.primefaces.model.charts.line.LineChartOptions;
import org.primefaces.model.charts.optionconfig.title.Title;


@ManagedBean(name = "chartJsView")
@SessionScoped
public class ChartJsView implements Serializable {
    
    
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LineChartModel lineModel;
     
    private LineChartModel cartesianLinerModel;
     
   
    @PostConstruct
    public void init() {

        createLineModel();
    }
     
   
    public void createLineModel() {
        lineModel = new LineChartModel();
        ChartData data = new ChartData();
        
         
        LineChartDataSet dataSet = new LineChartDataSet();
        List<Object> values = new ArrayList<>();
        values.add(65);
        values.add(59);
        values.add(80);
        values.add(81);
        values.add(56);
        values.add(55);
        values.add(40);
        dataSet.setData(values);
        dataSet.setFill(false);
        dataSet.setLabel("My First Dataset");
        dataSet.setBorderColor("rgb(75, 192, 192)");
        dataSet.setLineTension(0.1);
        data.addChartDataSet(dataSet);
         
        List<String> labels = new ArrayList<>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");
        labels.add("July");
        data.setLabels(labels);
         
        //Options
        LineChartOptions options = new LineChartOptions();        
        Title title = new Title();
        title.setDisplay(true);
        title.setText("Line Chart");
        options.setTitle(title);
        
        
       
         
        lineModel.setOptions(options);
        lineModel.setData(data);
    }
     
  
     
    
 
   
 
    public LineChartModel getLineModel() {
        return lineModel;
    }
 
    public void setLineModel(LineChartModel lineModel) {
        this.lineModel = lineModel;
    }
 
    public LineChartModel getCartesianLinerModel() {
        return cartesianLinerModel;
    }
 
    public void setCartesianLinerModel(LineChartModel cartesianLinerModel) {
        this.cartesianLinerModel = cartesianLinerModel;
    }
     
   
}