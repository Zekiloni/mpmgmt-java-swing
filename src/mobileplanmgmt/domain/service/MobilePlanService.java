/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mobileplanmgmt.domain.service;

import java.util.List;
import mobileplanmgmt.domain.model.MobilePlan;
import mobileplanmgmt.domain.model.MobilePlanCreate;

/**
 *
 * @author Zekiloni
 */
public interface MobilePlanService {
    MobilePlan create(MobilePlanCreate mobilePlanCreate);
    void delete(Long mobilePlanId);
    MobilePlan update(MobilePlan entity);
    MobilePlan getById(Long mobilePlanId);
    List<MobilePlan> getAll();
}
