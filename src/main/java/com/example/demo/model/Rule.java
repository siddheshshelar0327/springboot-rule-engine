package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "rule")
public class Rule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String expression;

    @Column(name = "rule_name")
    private String ruleName;

    // ✅ Constructor for saving rules
    public Rule(String expression, String ruleName) {
        this.expression = expression;
        this.ruleName = ruleName;
    }

    // ⚠️ Required default constructor for JPA
    public Rule() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getExpression() { return expression; }
    public void setExpression(String expression) { this.expression = expression; }

    public String getRuleName() { return ruleName; }
    public void setRuleName(String ruleName) { this.ruleName = ruleName; }
}
