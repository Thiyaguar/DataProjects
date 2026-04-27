import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
object DadaFile {

  def main(args:Array[String]):Unit={
    val q = 10
    print(q)
    print("hello World")
    val spark = SparkSession.builder()
      .appName("Scala Example")
      .master("local[*]")   // 👈 FIX HERE
      .getOrCreate()

    val df = spark.read
      .option("header", "true")
      .option("inferSchema", "true")
      .csv("sales.csv")

    val result = df
      .filter(col("amount") > 100)
      .groupBy("city")
      .agg(avg("amount").alias("avg_amount"))

    result.show()
  }
}