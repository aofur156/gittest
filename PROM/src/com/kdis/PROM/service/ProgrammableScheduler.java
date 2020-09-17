/*
 * package com.kdis.PROM.service;
 * 
 * import java.util.Date; import java.util.concurrent.TimeUnit;
 * 
 * import org.springframework.scheduling.Trigger; import
 * org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler; import
 * org.springframework.scheduling.support.PeriodicTrigger; import
 * org.springframework.stereotype.Component;
 * 
 * @Component public class ProgrammableScheduler {
 * 
 * private ThreadPoolTaskScheduler scheduler;
 * 
 * public void stopScheduler() { scheduler.shutdown(); }
 * 
 * public void startScheduler() { scheduler = new ThreadPoolTaskScheduler();
 * scheduler.initialize(); // �뒪耳�伊대윭媛� �떆�옉�릺�뒗 遺�遺�
 * scheduler.schedule(getRunnable(), getTrigger()); }
 * 
 * 
 * private Runnable getRunnable(){ return () -> { // do something
 * System.out.println(new Date()+"1"); }; }
 * 
 * 
 * private Trigger getTrigger() { // �옉�뾽 二쇨린 �꽕�젙 return new
 * PeriodicTrigger(100, TimeUnit.SECONDS); }
 * 
 * 
 * 
 * }
 */