import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.Period;

public class ConversaoDatas
{
	public static void main(String[] args) {
		
		comandosLocalDate();
		comandosLocalTime();
		comandosLocalDateTime();
		comandosMonthDayEYearMonth();
		comandosPeriod();
		
	}

	public static void comandosLocalDate() {
		System.out.println("LocalDate:");
		LocalDate localDate = LocalDate.now();
		System.out.println("Data Atual: "+ localDate);
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
		System.out.println("Mes: " + localDate.getMonthValue());
		System.out.println("Mes: " + localDate.getMonth().name());
		System.out.println("Ano: " + localDate.getYear()+"\n");
		
		LocalDate localDatePassado = localDate.minusDays(2);
		System.out.println("Data Atual - 2 dias: "+ localDatePassado);
		
		LocalDate localDateFuturo = LocalDate.of(2050, 7, 9);
		System.out.println("Criando uma data manualmente: " + localDateFuturo +"\n");
			
		System.out.println("Verifica se "+ localDateFuturo +" é depois de "+ localDatePassado + " : "+ localDateFuturo.isAfter(localDatePassado));
		System.out.println("Verifica se "+ localDatePassado +" é antes  de "+ localDateFuturo  + " : "+ localDatePassado.isBefore(localDateFuturo));
		System.out.println("Verifica se "+ localDate +" é igual  a "+ localDatePassado.plusDays(2) + " : "+ localDate.isEqual(localDatePassado.plusDays(2))+"\n \n");
		return;

	}

	public static void comandosLocalTime() {
		System.out.println("LocalTime:");
		LocalTime localTime = LocalTime.now();
		System.out.println("Horário Atual: "+ localTime);
		System.out.println("Hora: " + localTime.getHour());
		System.out.println("Minutos: " + localTime.getMinute());
		System.out.println("Segundos: " + localTime.getSecond()+"\n");
		System.out.println("NanoSegundos: " + localTime.getNano()+"\n");

		
		LocalTime localTimePassado = localTime.minusHours(2);
		System.out.println("Horário Atual - 2 Horas: "+ localTimePassado);
		
		LocalTime localTimeManual = LocalTime.of(8, 59, 45,0);
		System.out.println("Criando uma hora manualmente: " + localTimeManual +"\n");
			
		System.out.println("Verifica se "+ localTime +" é depois de "+ localTimePassado + " : "+ localTime.isAfter(localTimePassado));
		System.out.println("Verifica se "+ localTimePassado +" é antes  de "+ localTime  + " : "+ localTimePassado.isBefore(localTime));
		System.out.println("Verifica se "+ localTime +" é igual  a "+ localTimePassado.plusHours(2) + " : "+ localTime.equals(localTimePassado.plusHours(2))+"\n \n");
		
		return;
	}

	public static void comandosLocalDateTime() {
		System.out.println("LocalDateTime:");
		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println("Data e Horário Atual: "+ localDateTime +"\n");
		System.out.println("Apenas data atual: "+ localDateTime.toLocalDate());
		System.out.println("Dia da semana: " + localDateTime.getDayOfWeek().name());
		System.out.println("Dia da semana: " + localDateTime.getDayOfWeek().ordinal());
		System.out.println("Mes: " + localDateTime.getMonthValue());
		System.out.println("Mes: " + localDateTime.getMonth().name());
		System.out.println("Ano: " + localDateTime.getYear()+"\n");

		System.out.println("Apenas horário atual: "+ localDateTime.toLocalTime());
		System.out.println("Hora: " + localDateTime.getHour());
		System.out.println("Minutos: " + localDateTime.getMinute());
		System.out.println("Segundos: " + localDateTime.getSecond()+"\n");
		System.out.println("NanoSegundos: " + localDateTime.getNano()+"\n");

		
		LocalDateTime localDateTimePassado = localDateTime.minusHours(2);
		System.out.println("Data Atual com Horário - 2 Horas: "+ localDateTimePassado);
		
		
		LocalTime localTimeManual = LocalTime.of(8, 59, 45,0);
		LocalDate localDateFuturo = LocalDate.of(2050, 7, 9);
		LocalDateTime localDateTimeManual = LocalDateTime.of(localDateFuturo, localTimeManual);
		System.out.println("Convertendo LocalDate e LocalTime em LocalDateTime: " + localDateTimeManual +"\n");
			
		System.out.println("Verifica se "+ localDateTimeManual +" é depois de "+ localDateTime + " : "+ localDateTimeManual.isAfter(localDateTime));
		System.out.println("Verifica se "+ localDateTimePassado +" é antes  de "+ localDateTime  + " : "+ localDateTimePassado.isBefore(localDateTime));
		System.out.println("Verifica se "+ localDateTime +" é igual  a "+ localDateTimePassado.plusHours(2) + " : "+ localDateTime.equals(localDateTimePassado.plusHours(2))+"\n \n");
		
		return;
	}

	public static void comandosMonthDayEYearMonth(){
		System.out.println("MonthDay:");
		MonthDay mdAtual = MonthDay.now();
		System.out.println("Mês e Dia: "+ mdAtual +"\n");
		System.out.println("Apenas mês atual: "+ mdAtual.getMonth());
		System.out.println("Apenas mês atual: "+ mdAtual.getMonthValue());
		System.out.println("Dia: " + mdAtual.getDayOfMonth() + "\n");

		MonthDay fevereiro = MonthDay.of(2,29);
		System.out.println("Verifica se 29/02 é um dia valido para o ano 2020: " + fevereiro.isValidYear(2020) + "\n");
		System.out.println("Verifica se "+ mdAtual +" é depois de "+ fevereiro + " : "+ mdAtual.isAfter(fevereiro));
		System.out.println("Verifica se "+ fevereiro +" é antes  de "+ mdAtual  + " : "+ fevereiro.isBefore(mdAtual));
		System.out.println("Verifica se "+ fevereiro +" é igual  a "+ MonthDay.of(2,29) + " : "+ fevereiro.equals(MonthDay.of(2,29))+"\n \n");
		
		LocalDate ld = fevereiro.atYear(2020);
		System.out.println("Criar local date "+ ld +" a patir de MonthDate: "+ fevereiro +" + 2020 \n");
		

		System.out.println("YearMonth:");
		YearMonth ymAtual = YearMonth.now();
		System.out.println("Ano e mês: "+ ymAtual +"\n");
		System.out.println("Ano atual: " + ymAtual.getYear());	
		System.out.println("Apenas mês atual: "+ ymAtual.getMonth());
		System.out.println("Apenas mês atual: "+ ymAtual.getMonthValue() + "\n");
		

		YearMonth anoFevereiro = YearMonth.of(2020,2);
		System.out.println("Verifica se "+ ymAtual +" é depois de "+ ymAtual.plusMonths(2) + " : "+ ymAtual.isAfter(ymAtual.plusMonths(2)));
		System.out.println("Verifica se "+ anoFevereiro +" é antes  de "+ ymAtual  + " : "+ anoFevereiro.isBefore(ymAtual));
		System.out.println("Verifica se "+ anoFevereiro +" é igual  a "+ YearMonth.of(2020,2) + " : "+ anoFevereiro.equals(YearMonth.of(2020,2))+"\n \n");
		
		LocalDate ld2 = anoFevereiro.atDay(29);
		System.out.println("Criar local date "+ ld2 +" a patir do YearMonth: "+ anoFevereiro +" + 29 \n\n");
		return;
	}

	public static void comandosPeriod() {
		System.out.println("Period:");
		LocalDate agora = LocalDate.now();
		LocalDate futuro = agora.plusYears(1);

		Period periodo = Period.between(agora,futuro);
		System.out.println("Periodo entre "+agora+" e "+futuro);
		System.out.println(periodo.getYears() + " Anos " + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias");
		System.out.println("Quantidade de meses: " + periodo.toTotalMonths());
		return;
	}
}
