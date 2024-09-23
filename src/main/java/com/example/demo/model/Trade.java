package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "Trade")
public class Trade {

    @Field("TradeMessage")
    private TradeMessage tradeMessage;

    @Data
    public static class TradeMessage {

        @Field("trade")
        private InnerTrade trade;

        @Data
        public static class InnerTrade {

            @Field("product")
            private Product product;

            @Data
            public static class Product {

                @Field("FXOption")
                private FXOption fxOption;

                @Data
                public static class FXOption {

                    @Field("buySell")
                    private String buySell;

                    @Field("underlyingInstrumentName")
                    private String underlyingInstrumentName;

                    @Field("baseCurrency")
                    private String baseCurrency;

                    @Field("premiumPaymentDate")
                    private String premiumPaymentDate;

                    @Field("premiumPaymentAmount")
                    private Double premiumPaymentAmount;

                    @Field("premiumPaymentCurrency")
                    private String premiumPaymentCurrency;

                    @Field("strikeRate")
                    private Double strikeRate;

                    @Field("strikeQuoteBasis")
                    private String strikeQuoteBasis;

                    @Field("exerciseStyle")
                    private String exerciseStyle;

                    @Field("barrierFeature")
                    private BarrierFeature barrierFeature;

                    @Field("asianFeature")
                    private AsianFeature asianFeature;

                    @Field("fixingObservation")
                    private FixingObservation fixingObservation;

                    @Field("windowDelivery")
                    private WindowDelivery windowDelivery;

                    @Field("flexAccumulatorFeature")
                    private FlexAccumulatorFeature flexAccumulatorFeature;

                    @Field("flexTARFFeature")
                    private FlexTARFFeature flexTARFFeature;

                    @Field("pivotTARFFeature")
                    private PivotTARFFeature pivotTARFFeature;

                    @Data
                    public static class BarrierFeature {
                        @Field("knockType")
                        private String knockType;

                        @Field("barrierExerciseStyle")
                        private String barrierExerciseStyle;

                        @Field("startDate")
                        private String startDate;

                        @Field("endDate")
                        private String endDate;

                        @Field("discreteFeature")
                        private DiscreteFeature discreteFeature;

                        @Field("digitalFeature")
                        private DigitalFeature digitalFeature;

                        @Data
                        public static class DiscreteFeature {
                            @Field("rateInformationSourceName")
                            private String rateInformationSourceName;

                            @Field("calculationFrequencyType")
                            private CalculationFrequencyType calculationFrequencyType;
                        }

                        @Data
                        public static class DigitalFeature {
                            @Field("digitalAmountCurrency")
                            private String digitalAmountCurrency;
                        }
                    }

                    @Data
                    public static class AsianFeature {
                        @Field("startDate")
                        private String startDate;

                        @Field("endDate")
                        private String endDate;

                        @Field("rateInformationSource")
                        private String rateInformationSource;

                        @Field("calculationFrequencyType")
                        private CalculationFrequencyType calculationFrequencyType;
                    }

                    @Data
                    public static class FixingObservation {
                        @Field("observationDate")
                        private String observationDate;

                        @Field("observationRate")
                        private Double observationRate;
                    }

                    @Data
                    public static class WindowDelivery {
                        @Field("startDate")
                        private String startDate;

                        @Field("endDate")
                        private String endDate;

                        @Field("underlyingOwner")
                        private String underlyingOwner;
                    }

                    @Data
                    public static class FlexAccumulatorFeature {
                        @Field("payOutType")
                        private String payOutType;

                        @Field("startDate")
                        private String startDate;

                        @Field("endDate")
                        private String endDate;

                        @Field("expiryDate")
                        private String expiryDate;

                        @Field("archivingGroupLabelName")
                        private String archivingGroupLabelName;

                        @Field("numberOfFixingsCount")
                        private Double numberOfFixingsCount;

                        @Field("calculationFrequencyType")
                        private CalculationFrequencyType calculationFrequencyType;

                        @Field("autoBarrierStyle")
                        private String autoBarrierStyle;
                    }

                    @Data
                    public static class FlexTARFFeature {
                        @Field("targetAmount")
                        private Double targetAmount;

                        @Field("targetQuotationCurrencyPair")
                        private String targetQuotationCurrencyPair;

                        @Field("totalNominalAmount")
                        private Double totalNominalAmount;

                        @Field("startDate")
                        private String startDate;

                        @Field("endDate")
                        private String endDate;

                        @Field("expiryDate")
                        private String expiryDate;

                        @Field("archivingGroupLabelName")
                        private String archivingGroupLabelName;

                        @Field("numberOfFixingsCount")
                        private Double numberOfFixingsCount;

                        @Field("calculationFrequencyType")
                        private CalculationFrequencyType calculationFrequencyType;
                    }

                    @Data
                    public static class PivotTARFFeature {
                        @Field("pivotStyle")
                        private String pivotStyle;

                        @Field("knockInBarrier")
                        private KnockInBarrier knockInBarrier;

                        @Data
                        public static class KnockInBarrier {
                            @Field("knockInBarrierType")
                            private String knockInBarrierType;
                        }
                    }

                    @Data
                    public static class CalculationFrequencyType {
                        @Field("periodMultiplier")
                        private Integer periodMultiplier;

                        @Field("period")
                        private String period;
                    }
                }
            }
        }
    }
}