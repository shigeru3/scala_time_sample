import org.joda.time.format.DateTimeFormat
import org.joda.time.{DateTimeZone, DateTime}

object SampleDateTime extends App {
  q("現在時刻で初期化")
  val dt: DateTime = new DateTime()
  a(dt)

  q("UTCで初期化")
  val dtUTC: DateTime = new DateTime(DateTimeZone.UTC)
  a(dtUTC)

  q("yyyy--MM-ddでtoString")
  a(dt.toString("yyyy-MM-dd"))

  q("DateTimeFormat.fullDate()")
  a(dtUTC.toString(DateTimeFormat.fullDate()))

  q("DateTimeFormat.fullDateTime()")
  a(dtUTC.toString(DateTimeFormat.fullDateTime()))

  q("UTC -> JST")
  a(dtUTC.toDateTime(DateTimeZone.getDefault))

  //2015-06-21T12:39:49.424+09:00
  q("2015-06-21T12:39:49.424+09:00をdateに変換")
  val str = "2015-06-21T12:39:49.424+09:00"
  a(new DateTime(str))


  def q(str: String) = {
    println(str)
  }
  def a(str: Any) = {
    println(" =>  " + str)
  }
}
