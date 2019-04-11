import org.apache.spark.sql.SparkSession

object Main {

  def main(args: Array[String]) {
    implicit val spark: SparkSession = SparkSession.builder().getOrCreate()

    spark.stop()
  }

}
