package com.example.demo8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo8.form.ReviewRegistForm;

@Controller
public class ReviewController {

    /*--- 1. 登録画面を表示する ---*/
    @GetMapping("/show-review-form")
    public String showReviewForm(@ModelAttribute ReviewRegistForm form) { // pubic -> public 修正
        return "regist-review";
    }

    /*--- 2. 確認画面から戻る ---*/
    @PostMapping("/show-review-form-ret")
    public String showReviewFormRet(@ModelAttribute ReviewRegistForm form) {
        return "regist-review";
    }

    /*--- 3. 登録を実行する ---*/
    @PostMapping("/regist-review")
    public String registReview(
            @Validated @ModelAttribute ReviewRegistForm form,
            BindingResult result,
            Model model) { // Modelを追加

        // エラーがあれば入力画面に戻す
        if (result.hasErrors()) {
            return "regist-review";
        }

        // 成功メッセージをセット
        model.addAttribute("msg", "レビュー登録が完了しました");

        return "complete-regist-review";
    }
}