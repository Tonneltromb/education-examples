
import java.util.*;

public enum DocTypeCode {
    DI("Дополнительная информация о проведении предварительного отбора", "ДИ", null),
    I("Извещение об осуществлении закупки", "И", "ZfcsNotificationEFType,ZfcsNotificationEPType,ZfcsNotificationISOType,ZfcsNotificationOKType,ZfcsNotificationOKDType,ZfcsNotificationOKOUType,ZfcsNotificationPOType,ZfcsNotificationZakAType,ZfcsNotificationZakKType,ZfcsNotificationZakKDType,ZfcsNotificationZakKOUType,ZfcsNotificationZKType,ZfcsNotificationZPType"),
    II("Изменения извещения об осуществлении закупки", "ИИ", "ZfcsNotificationEFType,ZfcsNotificationEPType,ZfcsNotificationISOType,ZfcsNotificationOKType,ZfcsNotificationOKDType,ZfcsNotificationOKOUType,ZfcsNotificationPOType,ZfcsNotificationZakAType,ZfcsNotificationZakKType,ZfcsNotificationZakKDType,ZfcsNotificationZakKOUType,ZfcsNotificationZKType,ZfcsNotificationZPType"),
    IIL("Изменения извещения осуществления закупки в части лота", "ИИЛ", "ZfcsNotificationLotChangeType"),
    IO("Извещение об отмене определения поставщика (подрядчика, исполнителя)", "ИО", "ZfcsNotificationCancelType"),
    IOL("Извещение об отмене определения поставщика (подрядчика, исполнителя) в части лота", "ИОЛ", "ZfcsNotificationLotCancelType"),
    IP("Итоговый протокол", "ИП", "ZfcsProtocolZPFinalType"),
    IPP("Извещение о продлении срока подачи заявок", "ИПП", "ZfcsPurchaseProlongationZKType"),
    KS("Квитанция", "КС", null),
    OCP("Извещение об отмене протоколов", "ОЦП", null),
    OND("Отмена неструктурированного документа закупки", "ОНД", "ZfcsPurchaseDocumentCancelType"),
    OP("Извещение об отмене документа", "ОП", "ZfcsPurchaseDocumentCancelType"),
    P("Протокол предварительного отбора", "П", "ZfcsProtocolZKType,ZfcsProtocolPOType"),
    PO("Протокол отказа от заключения контракта", "ПО", null),
    POK("Протокол отказа от заключения контракта", "ПОК", "ZfcsProtocolEvasionType"),
    PPU("Протокол признания участника уклонившимся от заключения контракта", "ППУ", null),
    PP("Протокол проведения запроса предложений", "ПП", "ZfcsProtocolEF2Type,ZfcsProtocolZKAfterProlongType,ZfcsProtocolZPType"),
    PPE("Протокол первого этапа", "ППЭ", "ZfcsProtocolOKD3Type"),
    PPO("Протокол предквалификационного отбора", "ППО", "ZfcsProtocolOKD2Type,ZfcsProtocolOKOU2Type"),
    PPI("Протокол подведения итогов электронного аукциона", "ППИ", "ZfcsProtocolEF3Type"),
    PPN("Протокол о признании электронного аукциона несостоявшимся", "ППН", "ZfcsProtocolEFInvalidationType"),
    PR("Протокол рассмотрения заявок", "ПР", "ZfcsProtocolEF1Type"),
    PRE("Протокол рассмотрения единственной заявки", "ПРЕ", "ZfcsProtocolEFSingleAppType,ZfcsProtocolOKSingleAppType,ZfcsProtocolOKDSingleAppType,ZfcsProtocolOKOUSingleAppType"),
    PRO("Протокол рассмотрения и оценки заявок", "ПРО", "ZfcsProtocolOK2Type,ZfcsProtocolOKD5Type,ZfcsProtocolOKOU3Type"),
    PRZ("Протокол рассмотрения заявки единственного участника электронного аукциона", "ПРЗ", "ZfcsProtocolEFSinglePartType"),
    PVK("Протокол вскрытия конвертов с заявками", "ПВК", "ZfcsProtocolOK1Type,ZfcsProtocolOKOU1Type"),
    PVKI("Протокол вскрытия конвертов с заявками на участие в первом этапе двухэтапного конкурса и открытия доступа к поданным в форме электронных документов заявкам на участие в первом этапе двухэтапного конкурса", "ПВКI", "ZfcsProtocolOKD1Type"),
    PVKII("Протокол вскрытия конвертов с заявками на участие во втором этапе двухэтапного конкурса и открытия доступа к поданным в форме электронных документов заявкам на участие во втором этапе двухэтапного конкурса", "ПВКII", "ZfcsProtocolOKD4Type"),
    RD("Разъяснения положений документации", "РД", "ZfcsPurchaseDocumentType"),
    UD("Уточнение документации", "УД", null),
    UKD("Уточненная конкурсная документация", "УКД", null),
    UP("Уведомление о продлении срока рассмотрения и оценки заявок", "УП", "ZfcsPurchaseProlongationOKType"),
    VP("Выписка из протокола проведения запроса предложений", "ВП", null),
    VPP("Выписка из протокола проведения запроса предложений", "ВПП", null),
    SK("Сведения о заключении контракта на электронной площадке", "СК", null),
    UED("Уведомление об изменении даты и времени проведения электронного аукциона", "УИД", null),
    UOO("Уведомление об отмене решения об отмене определения поставщика", "УОО", null),
    ZRD("Запрос о даче разъяснений положений документации об электронном аукционе", "ЗРД", "ZfcsClarificationRequestType"),
    UIA("Уведомление об изменении даты и времени проведения электронного аукциона", "УИА", null),
    OIO("Извещение об отмене отмены определения поставщика (подрядчика, исполнителя)", "ОИО", null),
    OIOL("Извещение об отмене отмены определения поставщика (подрядчика, исполнителя) в части лота", "ОИОЛ", null),
    UIO("Уведомление об изменении организации, осуществляющей закупку", "УИО", null),
    DPO("Документ по процедуре определения поставщика (подрядчика, исполнителя)", "ДПО", null),// Данный тип добавлен только для соответствия со справочником. Не использовать в документах (вероятно, скоро он будет удален)
    IND("Иной документ", "ИНД", null),
    ROP("Результат определения поставщика", "РОП" , null),

    I615("Извещение об осуществлении закупки (ПП РФ 615)", "И615", "NotificationPOType,NotificationEFType"),
    II615("Изменения извещения об осуществлении закупки (ПП РФ 615)", "ИИ615", "NotificationPOType,NotificationEFType"),
    OP615("Извещение об отмене документа (ПП РФ 615)", "ОП615", "NotificationCancelType"),
    ZRD615("Запрос о даче разъяснений положений документации (ПП РФ 615)", "ЗРД615", "ClarificationRequestType"),
    RD615("Разъяснения положений документации (ПП РФ 615)", "РД615", "ClarificationType"),
    P615("Протокол комиссии по проведению предварительного отбора (ПП РФ 615)", "П615", "ProtocolPOType"),
    IP615("Изменение протокола проведения предварительного отбора (ПП РФ 615)", "ИП615", "ProtocolPOType"),
    OCP615("Отмена протокола предварительного отбора (ПП РФ 615)", "ОЦП615", "ProtocolCancelType"),
    PR615("Протокол рассмотрения заявок на участие в электронном аукционе (ПП РФ 615)", "ПР615", "ProtocolEF1Type"),
    IPR615("Изменение протокола рассмотрения заявок на участие в электронном аукционе (ПП РФ 615)", "ИПР615", "ProtocolEF1Type"),
    OPR615("Отмена протокола рассмотрения заявок на участие в электронном аукционе (ПП РФ 615)", "ОПР615", "ProtocolCancelType"),
    PP615("Протокол проведения электронного аукциона (ПП РФ 615)", "ПП615", "ProtocolEF2Type"),
    IPA615("Изменение протокола проведения электронного аукциона (ПП РФ 615)", "ИПА615", "ProtocolEF2Type"),
    OPP615("Отмена протокола проведения электронного аукциона (ПП РФ 615)", "ОПП615", "ProtocolCancelType"),
    AU615("Акт об уклонении от заключения договора (ПП РФ 615)", "АУ615" , "ActDeviationType"),
    OAU615("Отмена акта об уклонении от заключения договора (ПП РФ 615)", "ОАУ615" , "ActCancelType"),
    AO615("Акт об отказе от заключения договора (ПП РФ 615)", "АО615" , "ActEvasionType"),
    OAO615("Отмена акта об отказе от заключения договора (ПП РФ 615)", "ОАО615" , "ActCancelType"),
    @Deprecated
    OA615("Извещение от отмене акта (ПП РФ 615)", "ОА615", "ActCancelType"),

    KD("Конкурсная документация открытого конкурса в электронной форме", "КД", null),
    PROI("Протокол рассмотрения и оценки первых частей заявок на участие в открытом конкурсе в электронной форме", "ПРОI", null),
    PROII("Протокол рассмотрения и оценки вторых частей заявок на участие в открытом конкурсе в электронной форме",  "ПРОII", null),
    PRU("Протокол рассмотрения заявки единственного участника на участие в открытом конкурсе в электронной форме", "ПРУ", null),
    IPS("Извещение о продлении срока подачи заявок на участие в открытом конкурсе в электронной форме", "ИПС", null),
    RR("Разъяснение результатов открытого конкурса в электронной форме", "РР", null),
    ;

    private final String title;
    private final String prefix;
    private final static Set<DocTypeCode> nonUniqueType = new HashSet<DocTypeCode>();
    private final String jaxbClassName;

    DocTypeCode(String title, String prefix, String jaxbClassName) {
        this.title = title;
        this.prefix = prefix;
        this.jaxbClassName = jaxbClassName;
    }

    public String getTitle() {
        return title;
    }

    public String getPrefix() {
        return prefix;
    }

    public static Set<DocTypeCode> getNonUniqueType() {

        nonUniqueType.add(DI);
        nonUniqueType.add(RD);
        nonUniqueType.add(UP);
        nonUniqueType.add(POK);
        nonUniqueType.add(PPU);
        nonUniqueType.add(IO);
        nonUniqueType.add(IOL);
        nonUniqueType.add(IND);

        return nonUniqueType;
    }

    public static DocTypeCode getCodeByString(String code) {
        if (code == null) return null;
        for (DocTypeCode docTypeCode : values()) {
            if (docTypeCode.name().equalsIgnoreCase(code)) return docTypeCode;
        }
        return null;
    }

    public static List<DocTypeCode> getDocsByDocTitle(List<DocTypeCode> list, DocTypeCode dt){
        List<DocTypeCode> result = new ArrayList<>();
        if (list != null) {
            for (DocTypeCode ds : list){
                if (ds.equals(dt)) {
                    result.add(ds);
                }
            }
        }
        return result;

    }
}
