import java.text.SimpleDateFormat;
import java.util.Date;

// Тип счёта,Номер счета,Валюта,Дата операции,Референс проводки,Описание операции,Приход,Расход
public class Motions {

    private String type_count;
    private String n_count;
    private String currency;
    private String date_op;
    private String ref_post;
    private String descr_op;
    private String income;
    private String expense;


    public String getType_count() {
        return type_count;
    }

    public void setType_count(String type_count) {
        this.type_count = type_count;
    }

    public String getN_count() {
        return n_count;
    }

    public void setN_count(String n_count) {
        this.n_count = n_count;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDate_op() {
        return date_op;
    }

    public void setDate_op(String date_op) {
        this.date_op = date_op;
    }

    public String getRef_post() {
        return ref_post;
    }

    public void setRef_post(String ref_post) {
        this.ref_post = ref_post;
    }

    public String getDescr_op() {
        return descr_op;
    }

    public void setDescr_op(String descr_op) {
        this.descr_op = descr_op;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }


    public Motions(String type_count, String n_count, String currency, String date_op, String ref_post, String descr_op,
            String income, String expense) {
            this.type_count = type_count;
            this.n_count = n_count;
            this.currency = currency;
            this.date_op = date_op;
            this.ref_post = ref_post;
            this.descr_op = descr_op;
            this.income = income;
            this.expense=expense;

            }

}